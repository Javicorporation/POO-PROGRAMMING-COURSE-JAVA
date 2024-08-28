package com.polimorfismoyabstract;

public abstract class FiguraGeometrica {
    private String Color;

    public FiguraGeometrica(String color) {
        Color = color;
    }

    // método normal
//    public double perimetro(){
//        return 0;
//    }

    // metodo abstracto
    public abstract double perimetro();
}
