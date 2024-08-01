package com.arquitecturajava;

public class Bateria {
    private int capacidad;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Bateria(int capacidad) {
        super();
        this.capacidad = capacidad;
    }

    public int duracionBateria(){
        if (capacidad < 3000) {
            return 16;
        }
        return 24;
    }
}
