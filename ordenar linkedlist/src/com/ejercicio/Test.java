package com.ejercicio;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Persona> personass = new LinkedList<>();

        personass.add(new Persona(1, "Maria", 21));
        personass.add(new Persona(4, "Carla", 22));
        personass.add(new Persona(6, "Martha", 24));
        personass.add(new Persona(2, "Karen", 23));
        personass.add(new Persona(3, "Mirean", 25));
        personass.add(new Persona(0, "Lisa", 20));

        System.out.println(personass);
        System.out.println();
        Collections.sort(personass);
        System.out.println(personass);



    }

}
