/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.genericos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin - Paco
 */
public class ProbandoGenericos {

public static void probarMetodo(){


int num=10;
    Integer objNum= new Integer(10); //Objeto que hace referencia a una pos.memoria
   num=11;
           
    //Convertimos tipo primitivo en objeto(Boxing)
    String texto="" + String.valueOf(num);
    String texto2="" + objNum.toString();
    
    ArrayList<Str> listaStr=new ArrayList<>();
    insertarDobleGenerico(listaStr, new Date(82, 4, 10));
    insertarDobleGenerico(listaStr, new Date(84, 9, 20));
       
    System.out.println("Enteros: "+ listaStr.toString());
   
    ArrayList<Date> listaDate=new ArrayList<>();
    insertarDobleGenerico(listaDate, new Date(82, 4, 10));
    insertarDobleGenerico(listaDate, new Date(84, 9, 20));
   
    System.out.println("Enteros: "+ listaDate.toString());
    
}



public static <Tipo> void insertarDobleGenerico(ArrayList<Tipo> lista, Tipo valor){
lista.add(valor);
lista.add(valor);
}
        
public static void insertar(ArrayList<Integer> lista, int valor){

    lista.add(valor);
   
            
}

    private static void insertarDoble(ArrayList<Integer> lista, int valor) {
           
    lista.add(valor);
    
    }


}