package com.sinensia.api;

import java.util.ArrayList;

/**
 *
 * @author Admin - Paco
 */
public class ServicioProductoSingleton {
    
    
    private ArrayList<Producto> listaProductos;
    
    public void insertar(Producto p){
    listaProductos.add(p);
    }

    public Producto modificar(Producto p){
    
    p.setNombre(p.getNombre() + "-Modificado ");
    p.setPrecio(p.getPrecio() + "-Modificado ");
    return p;
    }

    public Producto[] obtenerTodos(){
    return(Producto[]) listaProductos.toArray();
    
    }      
    //La única instancia es publica
    private static ServicioProductoSingleton instancia = null;

    //Nadie puede hacer new excepto dentro de esta clase(puede ser protected)
    //Constructor privado vacio OBLIGATORIO
    private ServicioProductoSingleton() {
        this.listaProductos = new ArrayList<>();
    }
    //La primera vez que se llama al método, se crea la instancia, a partir de ese 
    //momento hasta que la alicacion termine, la instancia seguirá "viva y es devuelta por el método,
    //venga de donde venga la llamada
    public static ServicioProductoSingleton getInstancia(){
    if(instancia==null)
        instancia=new ServicioProductoSingleton();       
    return instancia;
    }


}
