package com.collectionsylistas.clasess;
public class Factura {
    private String nombre;
    private int importe;

    public Factura(String nombre, int importe) {
        this.nombre = nombre;
        this.importe = importe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
}
