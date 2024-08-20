package com.enums.clases;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Persona> listaPersonas;

    public Empresa() {
        this.listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        this.listaPersonas.add(persona);
    }

    public void mostrarPorNivel(NivelEstudio nivel){
        for (Persona persona : this.listaPersonas){
            if (persona.getNivelDeEstudio() == nivel) {
                System.out.println("- "+persona);
            }
        }
    }
}
