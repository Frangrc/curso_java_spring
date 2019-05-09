/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

/**
 *
 * @author Admin
 */


public class ClienteVip extends Cliente_1 {
   
    private String benefico;

    public ClienteVip(long id, String nombre, String email, boolean actividad) {
        super(id, nombre, email, actividad);
    }

    /**
     * Get the value of benefico
     *
     * @return the value of benefico
     */
    public String getBenefico() {
        return benefico;
    }

    /**
     * Set the value of benefico
     *
     * @param benefico new value of benefico
     */
    public void setBenefico(String benefico) {
        this.benefico = benefico;
    }
 
}
