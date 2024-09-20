package com.hereciasclaseabstr;

public class Test {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulos("Rectangulo");
        figura.dibuja();
        FiguraGeometrica figura2 = new Cuadrado("Cuadrado");
        figura2.dibuja();
    }
}
