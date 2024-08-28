package com.polimorfismoyabstract;

public class TrianguloEquilatero extends  FiguraGeometrica{

    private double lado;

    public TrianguloEquilatero(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return this.lado * 4;
    }
}
