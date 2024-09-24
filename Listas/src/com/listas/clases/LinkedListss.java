package com.listas.clases;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListss {

    // la instanciacion normal
    //LinkedListss list = new LinkedListss();
    // con la interface list
    List<Persona> lista = new LinkedList<>();

    public void agregarPersona(Persona p) {
        lista.add(p);
    }

    public void mostrarPersonas() {
        //System.out.println(lista);
        for (Persona p : lista) {
            System.out.println(p);
        }
    }
    public void borrarPersona(String nombre) {
        // creacion de Iterator de tipo persona
        Iterator<Persona> iterador = lista.iterator();
        // definicion de un bollena para detectar si se encontro
        boolean encontrado = false;
        // implementacion de while
        // .hasnext es parte de la interfaz Iterator en Java y se utiliza para determinar si hay más elementos disponibles en la colección que se está iterando.
        while (iterador.hasNext()) {
            Persona p = iterador.next();
            if (p.getNombre().equals(nombre)) {
                iterador.remove();
                encontrado = true;
                System.out.println("Eliminado exitosamente");
                break;
            }
        }
        // si es diferente, no se encontro
        if (!encontrado) {
            System.out.println("No existe el persona con el nombre " + nombre);
        }
    }

    public Persona buscarPersona(String nombre) {
        Persona p = null;
        for (Persona persona : lista) {
            if (persona.getNombre().equals(nombre)) {
                p = persona;
            }
        }
        return  p;
    }



}
