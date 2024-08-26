package com.herenciaejercicio.baraja.cartas;

import com.herenciaejercicio.clases.baraja.Palo;

public class CartaNumeral extends CartaConPalo{
    private int numero;

    public CartaNumeral(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }
}
