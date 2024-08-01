package com.arquitecturajava;

public class Tablet {
    private String marca;
    private Bateria bateria;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return bateria.getCapacidad();
    }

    public void setCapacidad(int capacidad) {
        bateria.setCapacidad(capacidad);
    }

    public Tablet(String marca, int capacidad) {
        super();
        this.marca = marca;
        this.bateria = new Bateria(capacidad);
    }

    public int duracionBateria(){
        return bateria.duracionBateria();
    }
}
