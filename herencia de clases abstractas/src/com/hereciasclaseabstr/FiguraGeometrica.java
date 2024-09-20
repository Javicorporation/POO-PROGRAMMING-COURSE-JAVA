package com.hereciasclaseabstr;

public abstract class FiguraGeometrica {
    private String tipoFigura;

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public abstract void dibuja();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "tipoFigura='" + tipoFigura + '\'' +
                '}';
    }
}
