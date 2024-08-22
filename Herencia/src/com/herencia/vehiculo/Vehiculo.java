package com.herencia.vehiculo;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String patente;

    public void acelerar(){
        System.out.println("acelerar..");
    }

    public void frenar(){
        System.out.println("frenar..");
    }

    public void encender(){
        System.out.println("encender..");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
