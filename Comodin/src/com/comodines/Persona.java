package com.comodines;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String mostrarNombres(){
       return nombre+" "+apellido;
    }

    @Override
    public String toString() {
        return "UtilListas{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
