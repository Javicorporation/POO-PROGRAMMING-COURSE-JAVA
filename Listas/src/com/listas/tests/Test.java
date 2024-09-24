package com.listas.tests;

import com.listas.clases.LinkedListss;
import com.listas.clases.Persona;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        LinkedListss lista = new LinkedListss();

        Persona p1 = new Persona("John", "Doe",17);
        Persona p2 = new Persona("John", "Doe",17);
        Persona p3 = new Persona("John", "Doe",17);

        lista.agregarPersona(p1);
        lista.agregarPersona(p2);
        lista.agregarPersona(p3);
        lista.mostrarPersonas();
        lista.borrarPersona(p2);
        System.out.println();
        lista.mostrarPersonas();
    }
}
