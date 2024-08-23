package com.herencia.vehiculo;

public class Moto extends Vehiculo {

    public int anchoDeManubrio;

    public Moto(String marca, String modelo, String patente, int anchoDeManubrio) {
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }

    public void hacerCaballito(){
        System.out.println("hacer caballito");
    }
}
