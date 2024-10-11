package com.ejercicio.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// hacemos a la clase inventario generica que extiende de la clase producto.
public class Inventario <T extends Producto>{

    // creacion de map y establecerlo private
    private Map<Integer, T> productos;

    public Inventario() {
        this.productos = new HashMap<>();
    }

    // ----------  creacion de metodos CRUD
    // metodo guardar
    public void agregarProductos(T producto) {
        this.productos.put(producto.getId(), producto);
    }

    // metodo buscar por ID
    public T buscarProductoId(int id) {
        return this.productos.get(id);
    }

    // listar productos
    public List<T> ListarProductos() {
        return new ArrayList<>(this.productos.values());
    }

    // metodo para eliminar un producto
    public void eliminarProducto(int id) {
        this.productos.remove(id);
    }

    // Metodo para actualizar productos
    public void actualizarProducto(T producto) {
        productos.put(producto.getId(), producto);
    }


}
