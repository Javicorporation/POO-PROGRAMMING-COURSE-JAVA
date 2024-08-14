package com.distribusiondelogica;

public class Motor {

    private String numero;
    private double cilindraje;
    private String tipo;
    private int revolucionesActuales;

    public Motor(String numero, double cilindraje, String tipo) {
        this.numero = numero;
        this.cilindraje = cilindraje;
        this.tipo = tipo;
        this.revolucionesActuales = revolucionesActuales;
    }

    public void acelerar(){
        this.revolucionesActuales += 1000;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "numero='" + numero + '\'' +
                ", cilindraje=" + cilindraje +
                ", tipo='" + tipo + '\'' +
                ", revolucionesActuales=" + revolucionesActuales +
                '}';
    }
}

