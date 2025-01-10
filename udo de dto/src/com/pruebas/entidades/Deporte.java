package com.pruebas.entidades;

public class Deporte {

    private String nombre;
    private int dificultad;

    public Deporte(String nombre, int dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
}
