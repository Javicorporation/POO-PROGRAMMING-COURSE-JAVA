package com.herenciaejercicio.baraja.cartas;
// con el extend la declaramos como carta
public class CartaJoker extends Carta{
    private boolean aColor;


    public CartaJoker(boolean aColor) {
        super();
        this.aColor = aColor;
    }

    @Override
    public String obtenerCarta(){
        return "El Joker a "+ (aColor ? "Colores." : "Blanco y negro");
    }

}
