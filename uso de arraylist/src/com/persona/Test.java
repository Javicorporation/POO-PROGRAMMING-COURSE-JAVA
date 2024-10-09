package com.persona;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // inizializacion de arrayList
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "juanin", "carla", 21));
        personas.add(new Persona(2, "paula", "carla", 21));
        personas.add(new Persona(3, "karen", "carla", 21));

        personas.forEach(v -> System.out.println(v.toString()));
    }
}
