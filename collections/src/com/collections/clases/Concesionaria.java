package com.collections.clases;

import java.util.ArrayList;
import java.util.Collection;

public class Concesionaria {
    private String nombre;
    private ArrayList<Auto> autos; // autos es nulll

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        // siempre instancia la lista en el constructor por que sino se quedara null
        this.autos = new ArrayList< >();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarConcesionaria() {
        if (autos.isEmpty()){
            System.out.println("No hay autos");
        } else {
            for (int i = 0; i < autos.size(); i++) {
                System.out.println(autos.get(i));
            }
        }
    }



    public void agregarAuto(Auto auto) {
        this.autos.add(auto);
    }
}
