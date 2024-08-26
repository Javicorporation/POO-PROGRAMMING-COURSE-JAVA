package com.herenciaejercicio.baraja.cartas;

// creamos la clase carta con un atributo tapada
public abstract class Carta {
    private boolean tapada;

    // creamos constructor vacio
    public Carta() {
    }

    // funciones
    public void darVuelta(){}

    public void mostrar(){}

    @Override
    public String toString() {
        return "Carta{" +
                "tapada=" + tapada +
                '}';
    }
}
