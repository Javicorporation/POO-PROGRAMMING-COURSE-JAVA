package com.javasql.pruebamvc.controlador;


import com.javasql.pruebamvc.modelo.Producto;
import com.javasql.pruebamvc.modelo.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/productos")
public class Controlador {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public String ListatProductos(Model model){
        List<Producto> productos = productoRepository.findAll();
        model.addAttribute("productos", productos);
        return "productos-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoProducto(Model model){
        model.addAttribute("producto", new Producto());
        return "producto-form";
    }

    @PostMapping
    public String guardarProducto(@ModelAttribute Producto producto){
        productoRepository.save(producto);
        return "redirect:/productos";
    }
}
