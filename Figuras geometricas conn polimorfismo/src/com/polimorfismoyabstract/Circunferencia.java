package com.polimorfismoyabstract;

public class Circunferencia extends FiguraGeometrica{
    private double radio;

    public Circunferencia(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double perimetro(){
       return 2 * this.radio * Math.PI;
    }
}
