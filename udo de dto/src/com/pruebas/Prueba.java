package com.pruebas;

import com.pruebas.entidades.Persona;
import com.pruebas.entidades.Persona1;
import com.pruebas.servicios.ServicioPersona;

import java.util.List;

public class Prueba {
    public static void main(String[] args) {

        ServicioPersona servicio = new ServicioPersona();

        List<Persona1> personas= servicio.buscarTodos();

        for (Persona1 persona: personas) {
            System.out.println(persona.getNombre());
        }
    }
}
