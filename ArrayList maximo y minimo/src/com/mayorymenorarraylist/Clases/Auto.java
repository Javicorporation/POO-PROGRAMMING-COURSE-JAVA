package com.mayorymenorarraylist.Clases;

public class Auto {
    private String petente;
    private String color;
    private int kilometraje;

    public Auto(String petente, String color, int kilometraje) {
        this.petente = petente;
        this.color = color;
        this.kilometraje = kilometraje;

    }

    public String getPetente() {
        return petente;
    }

    public void setPetente(String petente) {
        this.petente = petente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "petente='" + petente + '\'' +
                ", color='" + color + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
