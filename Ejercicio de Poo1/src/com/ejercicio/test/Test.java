package com.ejercicio.test;

import com.ejercicio.clase.Inventario;
import com.ejercicio.clase.Producto;
import com.ejercicio.clase.ProductoDigital;
import com.ejercicio.clase.ProductoFisico;

public class Test {
    public static void main(String[] args) {
        ProductoDigital productoDigital = new ProductoDigital(1,"Libro", "Drama",25,12.2, "WWW.book.com");
        ProductoFisico productoFisico = new ProductoFisico(1, "cama", "comoda", 230, 120,"muy grande");
        Inventario<Producto> inventario = new Inventario<>();

        inventario.agregarProductos(productoDigital);
        inventario.agregarProductos(productoFisico);


        for (Producto producto: inventario.ListarProductos()){
            System.out.println( "producto: " + producto.getNombre()+", precio venta: "+producto.);
        }

    }
}
