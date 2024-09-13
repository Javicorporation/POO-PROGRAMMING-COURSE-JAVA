package com.buscadorgenerico;

public class Auto implements Identificable<String>{
    private String patente;
    private String marca;
    private String color;

    public Auto(String patente, String marca, String color) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public String getId() {
        return patente;
    }

    @Override
    public void setId(String id) {
        this.patente = id;
    }

    @Override
    public boolean sameId(String id) {
        return this.patente.equals(id);
    }
}
