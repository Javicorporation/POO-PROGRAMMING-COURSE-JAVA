package com.ejercicio;

import java.util.ArrayList;

public class Alumno implements Aprobable{
    private String DNI;
    private String nombre;
    private String apellido;

    private ArrayList<Examen> examenes;

    public Alumno(String DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.examenes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", examenes=" + examenes +
                '}';
    }

    @Override
    public boolean aprobable() {
        return false;
    }
}

