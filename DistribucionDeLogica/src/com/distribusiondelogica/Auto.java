package com.distribusiondelogica;

public class Auto {

    private String patente;
    private String marca;
    private double precio;
    private String color;
    private Motor motor;

    public Auto(String patente, String marca, double precio, String color, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
    }
    public  void  acelerar(){
        this.motor.acelerar();
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                '}';
    }
}


