/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.api;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Decoradores en forma de anotación
@WebServlet(asyncSupported = true, urlPatterns = "/api/productos")
public class ProductoRestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter escritorRespuesta = response.getWriter();
        response.setContentType("application/json;charset=UTF=8");
        
        
        BufferedReader bufRead= request.getReader();
        
        //Guardamos lo que vayamos sacando del buffer
        StringBuilder textoJson= new StringBuilder();
        for(String lineaJson=bufRead.readLine(); lineaJson!=null;lineaJson=bufRead.readLine()){
        
        textoJson.append(lineaJson);
        }
        bufRead.close();
        //escritorRespuesta.println(textoJson.toString().toUpperCase());
        System.out.println(">>>>" + textoJson.toString().toUpperCase());
        
        Gson gson=new Gson();
        Producto producto=gson.fromJson(textoJson.toString(), Producto.class);
        System.out.println(">>>>" + producto.getNombre());
        //producto.setNombre(producto.getNombre().toUpperCase());
        //producto.setPrecio("5000 bolivares");
        ServicioProductoSingleton sps= ServicioProductoSingleton.getInstancia();
        sps.modificar(producto);
        
        
        String jsonRespuesta=gson.toJson(producto);
        escritorRespuesta.println(jsonRespuesta);
    }

}
