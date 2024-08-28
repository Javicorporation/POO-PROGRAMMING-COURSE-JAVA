package com.polimorfismoyabstract;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Rectangulo("Verde", 2, 2));
        figuras.add(new Circunferencia("Roja", 1));
        figuras.add(new Rectangulo("Amarillo", 1, 2));
        figuras.add(new Circunferencia("Azul", 2));
        figuras.add(new TrianguloEquilatero("Celeste", 4));

        for (FiguraGeometrica figura : figuras){
            System.out.println(figura.perimetro());
        }

    }
}
