/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sinensia.modelo;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin - Paco
 */
public class MySQLCliente {
public MySQLCliente() {
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    }
    catch(SQLException ex){
    Logger.getLogger(MySQLCliente.class.getName())
    .log(Level.SEVERE, "Error SQL", ex);    
    }
    catch(ClassNotFoundException ex){
    Logger.getLogger(MySQLCliente.class.getName())
    .log(Level.SEVERE, "Error en la clase", ex);     
    }
    catch(Exception ex){
    Logger.getLogger(MySQLCliente.class.getName())
    .log(Level.SEVERE, "Otro error", ex);  
    }
}


}
