/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import com.google.gson.Gson;
import com.sinensia.modelo.Cliente;
import com.sinensia.modelo.MySQLCliente;
import com.sinensia.modelo.logica.ServicioClientes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Los servlets heredan de la clase HttpServlet
 *
 * @author Admin - Paco
 */
public class RegistroServlet extends HttpServlet {

       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json;charset=UTF-8");
 
        try (PrintWriter salida = response.getWriter()) {  //Ponemos la respuesta como lectura de salida
        BufferedReader reader = request.getReader();
        Gson gson = new Gson(); //Se crea un objeto JSON con la librería de Google
        Cliente cli = gson.fromJson(reader, Cliente.class); //Se instancia la clase Data como un objeto JSON que apunta a la fuente de datos
        
        //Se imprimen los datos dentro del JSON
        System.out.println("Nombre: " + cli.getNombre());
        System.out.println("Edad: " + cli.getEdad());
        System.out.println("Email: " + cli.getEmail());
            
//            String nombre = request.getParameter("nombre");
//            String email = request.getParameter("email");
//            String password = request.getParameter("password_encrip");
//            String edad = request.getParameter("edad");
//            String activo = request.getParameter("activo");
//            ServicioClientes servCli;
//            servCli = new ServicioClientes();         
//            Cliente cli = null;
//            cli = servCli.insertar(nombre, email, password, edad, activo);
//            Gson gson = new Gson();
//            String jsonCli = gson.toJson(cli);
            
//            String jsonCli=" { ";
//            if (cli != null) {
//                
//                if (cli != null) {
//                    //Salida en estructura JSON
//                    jsonCli+= "   \"id\" : \"" + cli.getId() + "\"";
//                    jsonCli+= " , \"nombre\" : \"" + cli.getNombre() + "\""  ;
//                    jsonCli+= " ,  \"email\" : \"" + cli.getEmail() + "\""  ;
//                }           
//            }
//            jsonCli+= "}";
//            reader.print(jsonCli);
//            System.out.println(">>>>> " + jsonCli);
           // salida.println("{'nombre' : '"  + nombre +  "'}");
        }  
    } 
    
    
//    @Override
//    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
//            throws ServletException, IOException {
//        respuesta.setContentType("application/json;charset=UTF-8");
//        //cogemos el json
//    String jsonCli2=peticion.getParameter("jsonCli");
//    Gson gson = new Gson();
//    Cliente cli2 = gson.fromJson(jsonCli2, Cliente.class);
//    
//    try(BufferedReader reader = peticion.getReader()){
//            
//      
//            }
//        try (PrintWriter salida = respuesta.getWriter()) {
//            salida.println("<html><head>");
//            salida.println("<title>Web servlet desde Java</title>");
//            salida.println("</head><body>");
//            salida.println("<h1>Respuesta al registro</h1>");
//            salida.println("<h2>Ruta del servlet: "
//                    + peticion.getContextPath() + ", metodo: "
//                    + peticion.getMethod() + "</h2>");
//            salida.println("<ul>");
//            for (int i = 0; i < 3; i++) {
//                salida.println("<li>Num " + i + "</li>");
//            }
//            salida.println("</ul>");
//            
//            String nombre = peticion.getParameter("nombre");
//            String strEdad = peticion.getParameter("edad");
//            int edad = Integer.parseInt(strEdad);
//            String email = peticion.getParameter("email");
//            String strActivo = peticion.getParameter("activo");
//            boolean activo = false;
//            if (strActivo != null) {
//                activo = true;
//            }
//            //Expresion equivalente:
//            //boolean activo= strActivo != null;
//
//            salida.println("<p>nombre = " + nombre + "</p>");
//            salida.println("<p>edad = " + edad + "</p>");
//            salida.println("<p>email = " + email + "</p>");
//            salida.println("<p>activo = " + activo + "</p>");
//
//            MySQLCliente bdCliente = new MySQLCliente();
//
//            if (bdCliente.crear(nombre, email, email
//                    + "1234", edad, activo)) {
//                salida.println("<p>Guardado correctamente</p>");
//
//            } else {
//                salida.println("<p>Guardado ERRONEAMENTE</p>");
//            }
//
//            salida.println("</body></html>");
//            salida.println("");
//            salida.println("");
//        }
    

    @Override
    public String getServletInfo() {
        return "Registro clientes";

    }

}
