package com.javasql.pruebamvc.modelo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private List<Producto> productos = new ArrayList<>();
    private Long contadorID = 1L;

    public List<Producto> findAll() {
        return productos;
    }

    public Optional<Producto> FindById(Long id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void save(Producto producto) {
        if (producto.getId() == null){
            producto.setId(contadorID++);
        }
        productos.removeIf(p -> p.getId().equals(producto.getId()));
        productos.add(producto);
    }
}
