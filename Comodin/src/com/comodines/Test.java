package com.comodines;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Auto> autos = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();

        autos.add(new Auto("RYUEWR", "verde"));
        autos.add(new Auto("GDBNDC", "azul"));
        autos.add(new Auto("UIRYRE", "cafe"));

        personas.add(new Persona("carlos", "paz"));
        personas.add(new Persona("mario", "carl"));
        personas.add(new Persona("luis", "luz"));

        // una coleccion de autos no puede ser considerado una lista de objetos
        UtilListas.mostrarLista(autos);
    }
}
