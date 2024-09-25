package com.javalistmap.model;

public class Coche {
    private String identificador;
    private String marca;
    private double precio;

    public Coche(String identificador, String marca, double precio) {
        this.identificador = identificador;
        this.marca = marca;
        this.precio = precio;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
