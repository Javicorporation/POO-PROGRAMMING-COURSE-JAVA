package com.polimorfismoyabstract;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double perimetro(){
        return 2 * base + 2 * altura;
    }
}
