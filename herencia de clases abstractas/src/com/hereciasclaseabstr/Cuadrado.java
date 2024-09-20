package com.hereciasclaseabstr;

public class Cuadrado extends FiguraGeometrica{
    public Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibuja() {
        System.out.println("dibujando un "+getClass().getSimpleName());
    }
}
