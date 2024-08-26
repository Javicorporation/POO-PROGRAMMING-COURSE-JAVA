package com.herenciaejercicio.baraja.cartas;

public abstract class Carta {
    private boolean tapada;

    public Carta(boolean tapada) {
        this.tapada = tapada;
    }

    public void darVuelta(){}

    public void mostrar(){}

    @Override
    public String toString() {
        return "Carta{" +
                "tapada=" + tapada +
                '}';
    }
}
