/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;
import java.util.GregorianCalendar;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class FechaSinMinutos extends GregorianCalendar {

    public FechaSinMinutos(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

    public FechaSinMinutos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    super();
    
    }

   
  //Sobreescribimos metodo getTime()
    public Date getTimeWithoutSeconds(){
    Date fecha = new Date(((getTimeInMillis()+86399)/86400)*86400);
    fecha.setSeconds(0);
    fecha.setMinutes(0);
    fecha.setHours(0);
    return fecha;
    
    }

    @Override
    public boolean equals(Object obj) {//obj tiene forma objeto y es de tipo FechaSinMinutos
        
    if(obj instanceof FechaSinMinutos){
    //Casting: conversion de tipos
        FechaSinMinutos objFecha=(FechaSinMinutos) obj;
        if(this.get(YEAR) == objFecha.get(YEAR) 
                && this.get(MONTH) ==  objFecha.get(MONTH)
                && this.get(DAY_OF_MONTH) ==  objFecha.get(DAY_OF_MONTH))
          return true;  
    }
    return false;
    }
    
}
    

