package com.enums.clases;

public class Persona {
    private String nombre;
    private String apellido;
    private NivelEstudio nivelDeEstudio;

    public Persona(String nombre, String apellido, NivelEstudio nivelDeEstudio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelDeEstudio = nivelDeEstudio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public NivelEstudio getNivelDeEstudio() {
        return nivelDeEstudio;
    }

    public void setNivelDeEstudio(NivelEstudio nivelDeEstudio) {
        this.nivelDeEstudio = nivelDeEstudio;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nivelDeEstudio='" + nivelDeEstudio + '\'' +
                '}';
    }
}
