package com.ejerciciocombos;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private double totalVenta;
    List<ComboDeComida> combos;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.combos = new ArrayList<>();
        this.totalVenta = 0;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public String nombreApellido(){
        return this.nombre+" "+apellido;
    }

    public void totalDeCompra(double total){
        for (int i = 0; i < combos.size(); i++) {
            total += combos.get(i).getPrecio();
        }
        this.totalVenta = total;
    }

}
