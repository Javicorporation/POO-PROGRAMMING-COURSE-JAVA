package com.genericos;

public class Club {
    private String nombre;
    private PaisSubAmerica paisSubAmerica;

    public Club(String nombre, PaisSubAmerica paisSubAmerica) {
        this.nombre = nombre;
        this.paisSubAmerica = paisSubAmerica;
    }

    @Override
    public String toString() {
        return nombre + '\'' + " de " + paisSubAmerica;
    }
}
