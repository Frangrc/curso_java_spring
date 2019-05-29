/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.api;

/**
 *
 * @author Admin - Paco
 */
public class Producto {

    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String precio;

    /**
     * Get the value of precio
     *
     * @return the value of precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Set the value of precio
     *
     * @param precio new value of precio
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Producto() {
    }

}
