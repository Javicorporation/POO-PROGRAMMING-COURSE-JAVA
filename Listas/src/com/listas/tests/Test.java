package com.listas.tests;

import com.listas.clases.LinkedListss;
import com.listas.clases.Persona;


public class Test {
    public static void main(String[] args) {

        //objeto
        LinkedListss lista = new LinkedListss();

        Persona p1 = new Persona("John", "Doe",17);
        Persona p2 = new Persona("Jhn", "Doe",17);
        Persona p3 = new Persona("Juanin", "Doe",17);

        lista.agregarPersona(p1);
        lista.agregarPersona(p2);
        lista.agregarPersona(p3);
        lista.mostrarPersonas();

        System.out.println();
        lista.borrarPersona("John");
        lista.mostrarPersonas();



        System.out.println();
        System.out.println("encontrado");
        Persona p = lista.buscarPersona("Jhn");
        System.out.println(p);
    }
}
