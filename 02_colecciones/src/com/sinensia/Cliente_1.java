package com.sinensia;

public class Cliente_1 {
  protected long id;
  protected String nombre;
  private boolean actividad;  
  private String email;

    public Cliente_1(long id, String nombre, String email, boolean actividad) /*throws Exception*/{
        this.id = id;
        if((nombre == null)||(nombre == "")){
    //throw new Exception("Nombre de cliente invalido");
    System.err.println("Nombre del cliente invalido");
    }
        this.nombre = nombre;
        this.email = email;
        this.actividad = true;
    }


public long getId(){
return this.id;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
    this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setActividad(boolean actividad) {
        this.actividad = actividad;
    }
    
public void mostrar(){

System.out.println("Cliente " + nombre);
System.out.println("Id " + this.id);
System.out.println("Email " + this.getEmail());
}


}
