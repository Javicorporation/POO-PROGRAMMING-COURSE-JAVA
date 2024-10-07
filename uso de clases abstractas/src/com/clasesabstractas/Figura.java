package com.clasesabstractas;

public abstract class Figura {
    private double posicionX;
    private double posicionY;

    public Figura(double posicionX, double posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public Figura() {
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public abstract double calcularArea();
}
