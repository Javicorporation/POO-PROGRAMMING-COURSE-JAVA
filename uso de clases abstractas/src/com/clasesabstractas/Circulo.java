package com.clasesabstractas;

public class Circulo extends Figura{

    private double radius;

    public Circulo(double posicionX, double posicionY, double radius) {
        super(posicionX, posicionY);
        this.radius = radius;
    }


    @Override
    public double calcularArea() {
        return radius * radius * Math.PI;
    }
}
