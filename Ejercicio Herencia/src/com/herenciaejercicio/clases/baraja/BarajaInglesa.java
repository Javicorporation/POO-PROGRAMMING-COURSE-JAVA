package com.herenciaejercicio.clases.baraja;

import com.herenciaejercicio.baraja.cartas.Carta;
import com.herenciaejercicio.baraja.cartas.CartaFigura;
import com.herenciaejercicio.baraja.cartas.CartaJoker;
import com.herenciaejercicio.baraja.cartas.CartaNumeral;

import java.util.ArrayList;

public class BarajaInglesa {

    ArrayList<Carta> barajaCartas;

    public BarajaInglesa() {
        this.barajaCartas = new ArrayList<>();
    }

    public void mostrarBarajaInglesa() {
        for(Carta carta : barajaCartas){
            carta.mostrar();
        }
    }

    public void generarCartas(){
        generarCartasNumericas();
        generarCartasFigura();
        generarCartasJoker();
    }

    private void generarCartasNumericas(){
        // creamos valores maximos y minimos
        final int VALORMIN = 1;
        final int VALORMAX = 10;
        //creamos un array de palos con el metodo values
        Palo[] palos = Palo.values();

        // corremos los palos
        for (int i = 0; i < palos.length; i++) {
            // creamos una nueva variable palo actual y le asignamos i
            Palo paloActual = palos[i];
            for (int j = 0; VALORMIN <= VALORMAX ; j++) {
                // agregamos y generamos un objeto Carta numeral
                this.barajaCartas.add(new CartaNumeral(j, paloActual));

            }

        }
    }
    private void generarCartasFigura(){
        char[] letras = {'A', 'J', 'Q', 'K'};

        Palo[] palos = Palo.values();

        for (int i = 0; i < palos.length; i++) {
            Palo paloActual = palos[i];
            for (int j = 0; j < letras.length; j++) {
                char letra = letras[j];
                this.barajaCartas.add(new CartaFigura(letra, paloActual));
            }
        }
    }
    private void generarCartasJoker(){
        barajaCartas.add(new CartaJoker(false));
        barajaCartas.add(new CartaJoker(true));
    }
}
