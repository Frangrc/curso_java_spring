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
        System.out.println("Leyendo ejercicio ficheros");
        try {
            escaner = new Scanner(ejerRutaRelativa);

            while (escaner.hasNextLine()) {//Busca hasta el sihuiente cambio de linea

                String linea = escaner.nextLine();

                System.out.println(">>>>>>>> \"" + linea + "\"");
                for(String dato : linea.split(",")){
                System.out.println("Campo:" + dato.trim());
                }
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
