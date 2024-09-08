package com.ejerciciocombos;

public class ComboDeComida {
    private String nombreDeCombo;
    private double precio;

    public ComboDeComida(String nombreDeCombo, double precio) {
        this.nombreDeCombo = nombreDeCombo;
        this.precio = precio;
    }

    public String getNombreDeCombo() {
        return nombreDeCombo;
    }

    public double getPrecio() {
        return precio;
    }


    @Override
    public String toString() {
        return "Menu{" +
                "nombreDeCombo='" + nombreDeCombo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
