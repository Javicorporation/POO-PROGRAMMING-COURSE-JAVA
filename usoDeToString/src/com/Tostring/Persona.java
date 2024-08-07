package com.Tostring;

public class Persona {

    private String Nombre;
    private String Apellido;
    private int edad;
    private boolean tieneHijos;

    public Persona(String nombre, String apellido, int edad, boolean tieneHijos) {
        Nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        this.tieneHijos = tieneHijos;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    @Override
    public String toString() {
        return  "Nombre: "+Nombre+
                ", apellido: "+ Apellido+
                ", edad: "+edad+
                ", tiene hijos: "+ tieneHijos;
    }
}
