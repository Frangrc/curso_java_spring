/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.Cliente_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Colecciones {
    
  public static void ejemploHashMap(){
    
        HashMap<String, Cliente_1> diccClientes;
    diccClientes = new HashMap<String, Cliente_1>();
    Cliente_1 ana= new Cliente_1(1, "Ana", null, false);
    Cliente_1 luis= new Cliente_1(2, "Luis", null, false);
    Cliente_1 bea= new Cliente_1(3, "Bea", null, false);
    
    diccClientes.put("a1", ana);
    diccClientes.put("b2", luis);
    diccClientes.put("c3", bea);
    //System.out.println("Bea? " + diccClientes.get("c3").get.Nombre());
    
   // if(! diccClientes.containskey("c3")){
    diccClientes.put("c3", new Cliente_1(4, "Pedro", null, false));
    }
    //System.out.println("Bea?" + diccClientes.get("c3").getNombre);
    
    //for(Map.Entry<String, Cliente_1> parClaveValor : diccClientes.entrySet())
    {
    System.out.println("Cliente " + parClaveValor.getKey());
    Cliente_1 cliente = parClaveValor.getValue();
    System.out.println(" Nombre: " + cliente.getNombre());
    }
    
    
    
    }
    
    
        public static void ejemploListas(){
    ArrayList<Cliente_1> listaClientes;
    listaClientes=new ArrayList();

    listaClientes.add(new Cliente_1(1, "Ana", null, false));
    listaClientes.add(new Cliente_1(1, "Luis", null, false));
    listaClientes.add(new Cliente_1(1, "Bea", null, false));
    listaClientes.remove(1);
    Cliente_1 bea = listaClientes.get(1);
    bea.setEmail("bb@bb.com");
    for (int i=0; i<listaClientes.size(); i++){
   // System.out.println("Cliente" + i + ": " + listaClientes.getNombre() + ", " + listaClientes.getId(i));
            }
    
    
    for (Cliente_1 cliente : listaClientes) {//Para cada nombre, Recorremos la lista de clientes y sacamos
                                           // por pantalla cada nombre

System.out.println("Cliente: " + cliente.getNombre());
}
   }   
}  

