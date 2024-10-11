package com.ejercicio.clase;

public class ProductoFisico extends Producto implements Vendible{
    private double peso;
    private String dimenciones;

    public ProductoFisico(int id, String nombre, String descripcion, double precio, double peso, String dimenciones) {
        super(id, nombre, descripcion, precio);
        this.peso = peso;
        this.dimenciones = dimenciones;
    }

    @Override
    public double calcularPrecioVenta() {
        double transporte = 1.50 * this.peso;
        return getPrecio()+transporte;
    }
}
