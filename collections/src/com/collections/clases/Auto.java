package com.collections.clases;

public class Auto {
    private String modelo;
    private String color;

    public Auto(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
