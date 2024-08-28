package com.herenciaejercicio.baraja.cartas;

import com.herenciaejercicio.clases.baraja.Palo;

// con el extend la declaramos como carta
public abstract class CartaConPalo extends Carta{

    private Palo palo;

    public Palo getPalo() {
        return palo;
    }

    public CartaConPalo(Palo palo) {
        super();
        this.palo = palo;
    }

    public String mostrarPalo(){
        return " de "+palo;
    }


}
