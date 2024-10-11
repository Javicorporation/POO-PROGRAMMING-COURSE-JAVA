package com.ejercicio.clase;

public class ProductoDigital extends Producto implements Vendible{
    private double tamano;
    private String url;

    public ProductoDigital(int id, String nombre, String descripcion, double precio, double tamano, String url) {
        super(id, nombre, descripcion, precio);
        this.tamano = tamano;
        this.url = url;
    }

    @Override
    public double calcularPrecioVenta() {
        double descuento = 0.15;
        return getPrecio()-(getPrecio()*descuento);
    }
}
