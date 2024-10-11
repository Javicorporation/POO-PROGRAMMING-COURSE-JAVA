package com.ejemplos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        List<Persona> personas = new LinkedList<>();

        personas.add(new Persona(1, "Maria", 21));
        personas.add(new Persona(4, "Carla", 22));
        personas.add(new Persona(6, "Martha", 24));
        personas.add(new Persona(2, "Karen", 23));
        personas.add(new Persona(7, "Mirean", 25));
        personas.add(new Persona(0, "Lisa", 20));

        System.out.println(personas);
    }



}
