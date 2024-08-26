package com.herenciaejercicio.baraja.cartas;

import com.herenciaejercicio.clases.baraja.Palo;

public class CartaFigura extends CartaConPalo{
    private char letra;


    public CartaFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }
}
