package com.usodegenericos;

public class Caja <T>{
    private T valor;

    public void ponerAlgo( T contenido) {
        this.valor = contenido;
    }

    public T obtenerValor() {
    return valor;
    }
}
