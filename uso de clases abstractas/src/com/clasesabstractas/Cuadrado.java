package com.clasesabstractas;

public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(double posicionX, double posicionY, int lado) {
        super(posicionX, posicionY);
        this.lado = lado;
    }



    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
