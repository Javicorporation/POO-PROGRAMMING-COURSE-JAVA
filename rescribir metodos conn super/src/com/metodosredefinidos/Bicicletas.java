package com.metodosredefinidos;

public class Bicicletas {
    private final int KLM_MAXIMO = 50;
    private String marca;
    private int rodado;
    private int cantidadKl;


    public Bicicletas(String marca, int rodado, int cantidadKl) {
        this.marca = marca;
        this.rodado = rodado;
        this.cantidadKl = cantidadKl;
    }

    // método a heredar
    boolean servicioUsable(){
        return cantidadKl < KLM_MAXIMO;
    }
}
