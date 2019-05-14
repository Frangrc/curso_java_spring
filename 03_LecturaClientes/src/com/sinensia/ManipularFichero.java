/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

import static com.sinensia.pruebas.Polimorfismo.clientes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
//import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin - Paco
 */
public class ManipularFichero {

    public static ArrayList<Cliente> clientestxt;

    public static void leerFichero() {

        File ejerRutaRelativa = new File("Ejercicio ficheros.txt");
        Scanner escaner = null;
        HashMap<Integer, Cliente> mapDat=new HashMap<Integer, Cliente>();
        
        System.out.println("Leyendo ejercicio ficheros");
        try {
            escaner = new Scanner(ejerRutaRelativa);

            while (escaner.hasNextLine()) {//Busca hasta el sihuiente cambio de linea

                String linea = escaner.nextLine();

                System.out.println(">>>>>>>> \"" + linea + "\"");
                
                try{
                
                }
                catch(Exception ex){
                
                    System.err.println("Error en parseo" + getMessage());
                }
                String campos[]=linea.split(",");
                Cliente cliente;
                if(campos.length==4 || campos.length==5){
                
             
                long id= Integer.parseInt(campos[0]);
                String nombre=campos[1];
                String email=campos[2];
                boolean activo=campos[3].equals("true") ? true : false; 
                int duracionMax=0;
                if(campos.length==5){
                    duracionMax=Integer.parseInt(campos[4]);
                    cliente= new ClienteInvitado(id, nombre, email);
                    ((ClienteInvitado) cliente).setDuracionMax(duracionMax);
                }
                else{
                    cliente= new ClienteInvitado(id, nombre,email);
                }
                cliente.setActivo(activo);
                }
                
                mapDat.put(id,cliente);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManipularFichero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    public static void llenarHashMap() {
//
//        TreeMap<String, Cliente> listClientes;
//        listClientes = new TreeMap<String, Cliente>();
//        for (Cliente cliente : clientestxt) {
//            diccClientes.put(cliente.getNombre() + "-" + cliente.getId(), cliente);
//        }
//
//    }

}
