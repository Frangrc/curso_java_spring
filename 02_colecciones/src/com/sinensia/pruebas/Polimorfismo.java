/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.ClienteInvitado;
import com.sinensia.Cliente_1;
/**
 *
 * @author Admin
 */
public class Polimorfismo {
    
    public static void polimorfeando(){
    ClienteInvitado invitado;
     invitado = new ClienteInvitado(0, "Juan", null, false);
     invitado.setDuracionMax(10);
    invitado.mostrar();
    invitado.setDuracionMax(10);
//Objeto de tipo clienteinvitado con la forma de Cliente_1
    Cliente_1 clienteNormal=invitado;//clienteNormal=direccion de memoria donde está ClienteInvitado
    //System.out.println("Nombre: " + clienteNormal.getNombre());
    clienteNormal.mostrar();
    //convertimos la forma del hijo a la del padre
    ClienteInvitado mismoCliInvi=(ClienteInvitado)clienteNormal;
    
    /*Provoca una escepcion de error de casting
    Cliente_1 normal = new Cliente_1(0, "", null, false);
    ClienteInvitado normalEnIvit = (ClienteInvitado) normal;
    System.out.println("Nombre: " + normalEnIvit.getDuracionMax());*/
    }
}