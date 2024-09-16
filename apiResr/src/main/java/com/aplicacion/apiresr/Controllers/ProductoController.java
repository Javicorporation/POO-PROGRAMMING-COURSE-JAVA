package com.aplicacion.apiresr.Controllers;

import com.aplicacion.apiresr.Entities.Producto;
import com.aplicacion.apiresr.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {


    @Autowired
    private ProductoRepository productoRepository;



    @GetMapping
    public List<Producto> getAllProductos(){
        return productoRepository.findAll();
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto){
        return productoRepository.save(producto);
    }


}
