package com.buscadorgenerico;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList <Persona> personas = new ArrayList<>();
        ArrayList <Auto> autos = new ArrayList<>();


        autos.add(new Auto("BCD234","VMW", "Verde"));
        autos.add(new Auto("DEF458", "Toyota", "Blanco"));
        autos.add(new Auto("CDE345","MAS", "Azul"));
        autos.add(new Auto("DEF457","VMW", "Gris"));

        Buscador<Auto, String> BuscadorDeAuto;
        BuscadorDeAuto = new Buscador<>();
        Auto a = BuscadorDeAuto.buscar(autos,"DEF457");
        System.out.println(a);


        personas.add(new Persona(1234, "Pepe", "Gomez", 18));
        personas.add(new Persona(1596, "Ana", "Perez",24));
        personas.add(new Persona(7645, "Luis", "Lopez", 21));
        personas.add(new Persona(2345, "Lía", "Alvarez", 19));
        personas.add(new Persona(4763, "Sara", "Britez",20));

        Buscador<Persona, Integer> buscadorDePersona;
        buscadorDePersona = new Buscador<>();
        Persona persona = buscadorDePersona.buscar(personas,2345);
        System.out.println(persona);


    }
}
