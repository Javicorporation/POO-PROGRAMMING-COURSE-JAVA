package com.herenciaejercicio.clases.baraja;

public enum Palo {
    DIAMANTE(Color.ROJO),
    CORAZON(Color.ROJO),
    PICA(Color.NEGRO),
    TREBOL(Color.NEGRO);

    private Color color;

    Palo(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
