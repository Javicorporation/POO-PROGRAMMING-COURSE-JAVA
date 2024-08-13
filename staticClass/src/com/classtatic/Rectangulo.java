package com.classtatic;

public class Rectangulo {

    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double area(){
        return lado1 * lado2;
    }

    public double perimetro(){
        return lado1*2 + lado2*2;
    }


}
