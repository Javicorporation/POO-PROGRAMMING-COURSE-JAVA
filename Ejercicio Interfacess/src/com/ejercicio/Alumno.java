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

    public void agregarExamen(Examen examen) {
        examenes.add(examen);
    }

    @Override
    public boolean aprobable() {
        int i = 0;
        while (i < this.examenes.size() && this.examenes.get(i).aprobable()) {
            i++;
        }
        return i == this.examenes.size();
    }
}

