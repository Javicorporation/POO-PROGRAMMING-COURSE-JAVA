package com.claseyobjetos;

import java.util.ArrayList;

public class Habitacion {
    private ArrayList<Bombilla> bombillas = new ArrayList<>();

    public ArrayList<Bombilla> getBombillas() {
        return bombillas;
    }

    public void setBombillas(ArrayList<Bombilla> bombillas) {
        this.bombillas = bombillas;
    }

    public void addBombilla(Bombilla b){
        bombillas.add(b);
    }
}
