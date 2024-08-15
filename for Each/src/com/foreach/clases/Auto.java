package com.foreach.clases;

public class Auto {
    private String modelo;
    private String color;
    private double kilometroR;

    public Auto(String modelo, String color, double kilometroR) {
        this.modelo = modelo;
        this.color = color;
        this.kilometroR = kilometroR;
    }

    public double getKilometroR() {
        return kilometroR;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", kilometroR=" + kilometroR +
                '}';
    }
}
