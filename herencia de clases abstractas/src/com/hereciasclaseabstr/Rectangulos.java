package com.hereciasclaseabstr;

public class Rectangulos extends FiguraGeometrica{

    public Rectangulos(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibuja() {
        System.out.println("se dibuja un "+ getClass().getSimpleName());
    }
}
