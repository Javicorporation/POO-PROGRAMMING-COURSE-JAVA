package com.ejercicioarraylist.Clases;

public class Instrumento {
    private String ID;
    private double precio;
    private TipoInstrumento tipo;

    public Instrumento(String ID, double precio, TipoInstrumento tipo) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "ID='" + ID + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }
}
