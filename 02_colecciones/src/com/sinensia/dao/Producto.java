/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.dao;

/**
 *
 * @author Admin - Paco
 */
public class Producto {

    public Producto(long id, double precio, int stock) {
        this.id = id;
        this.precio = precio;
        this.stock = stock;
    }

    private long id;
    private double precio;
    private int stock;
    
}


