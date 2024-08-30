package com.ejemplo;

public class Persona implements Identificable{
    private String NI;

    public Persona(String NI) {
        this.NI = NI;
    }

    @Override
    public void mostrarIdentificacion() {
        System.out.println(this.NI);
    }
}
