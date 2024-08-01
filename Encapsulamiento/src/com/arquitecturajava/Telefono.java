package com.arquitecturajava;

public class Telefono {

    private String marca;
    private Bateria bateria;

    // Gets and Sets
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
//
    public int getCapacidad() {
        return bateria.getCapacidad();
    }

    public void setCapacidad(int capacidad) {
        bateria.setCapacidad(capacidad);
    }

    //constructor
    public Telefono(String marca, int capacidad) {
        super();
        this.marca = marca;
        this.bateria = new Bateria(capacidad);
    }

    public int duracionDeBateria(){
        return bateria.duracionBateria();
    }



}
