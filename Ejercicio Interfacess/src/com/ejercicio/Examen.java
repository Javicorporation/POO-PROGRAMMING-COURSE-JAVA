package com.ejercicio;

public class Examen implements Aprobable{
    private String fecha;

    public Examen(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean aprobable() {
        return false;
    }
}
