/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 *
 * @author Admin - Paco
 */
public class ClienteDAO implements InterfazDAO<Cliente> {
    
    HashMap<Long, Cliente> mapa;
    Cliente List;
    
public ClienteDAO() {
mapa= new HashMap<>();

}

    @Override
    public void poner(Cliente cli){
if(cli==null){
System.err.println("No se pueden añadir nulos");
return;
}
    mapa.put(cli.getId(), cli);

}

    @Override
    public Cliente leerUno(long id){
    if(mapa.containsKey(id)){

    return mapa.get(id);

    }
    System.err.println("Clave/ID no encontrado " + id);
    return null;

}
    
    @Override
    public void eliminar(Cliente cliente) {
       mapa.remove(cliente.getId());
    }

    @Override
    public void eliminar(long id) {
        mapa.remove(id);
    }

    @Override
    public List<Cliente> leerTodos() {
        
   ArrayList<Cliente> lista;
   lista = new ArrayList<Cliente>();
   
    for (Map.Entry<Long,Cliente> ent  : mapa.entrySet()) {
    
    lista.add(ent.getValue());
    }
    return lista;
    
    }

@Override
public void modificar(Cliente nuevoValor){

Cliente cli= mapa.get(nuevoValor.getId());
cli.setActivo(nuevoValor.isActivo());
cli.setNombre(nuevoValor.getNombre());
cli.setEmail(nuevoValor.getEmail());

}
//for(int indice = 0;indice<mapa.size();indice++)
//{Cliente clientes = mapa.get(indice);
////Cliente clientesN = mapa.get.containsKey(id);
////Cliente clientesEm = mapa.get(Email);
//    System.out.println("Cliente " + indice + ": "
//                + clientes.);
//                //+ ", " + clientes.getEmail());
//
////        for (Map.Entry<Long,Cliente> parClaveValor  : listClientes.entrySet()) 
////        {
////            System.out.println("Cliente " + parClaveValor.getKey());
////            Cliente cliente = parClaveValor.getValue();
////            System.out.println("  Nombre: " + cliente.getNombre());
////            
////        }    
// 
//}return null;
    
    
    

}

