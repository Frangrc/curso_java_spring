/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.dao;

import com.sinensia.Cliente;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin - Paco
 */
public class ClienteDAO implements InterfazDAO<Cliente> {
    
    HashMap<Long, Cliente> mapa;
    
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
        
        List<Cliente> listClientes;
        listClientes = new List<Cliente>();

for(Cliente cli : listClientes)
{
    //imprimimos el objeto pivote
    System.out.println(cli);
}

for(int indice = 0;indice<listClientes.size();indice++)
{
    System.out.println(listClientes.get(indice));
}

listClientes.forEach(System.out::println);

//        for (List.Entry<Cliente> parClaveValor  : listClientes.entrySet()) 
//        {
//            System.out.println("Cliente " + parClaveValor.getKey());
//            Cliente cliente = parClaveValor.getValue();
//            System.out.println("  Nombre: " + cliente.getNombre());
//            
//        }    
    
    }

    @Override
    public void modificar(Cliente cli) {
      if(cli==null){
System.err.println("No se pueden modificar nulos");
return;
}
    //mapa.put(cli.setNombre(), cli);  
    }


}
