package com.equalshashcode;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {

        // creamos 2 objetos personas
        Persona p1 = new Persona();
        p1.setNombre("Juanin");

        Persona p2 = new Persona();
        p2.setNombre("Paulin");

        // los guardamos en un HashSet
        HashSet<Persona> personas = new HashSet<>();
        personas.add(p1);
        personas.add(p2);

        System.out.println(personas.contains(p1));



    }
}
