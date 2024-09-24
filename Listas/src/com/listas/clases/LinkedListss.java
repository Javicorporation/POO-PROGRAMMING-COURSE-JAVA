package com.listas.clases;

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
        for (Persona p : lista) {
            if (p.getNombre().equals(nombre)) {
                lista.remove(p);
                System.out.println("Eliminación exitosa");
            }else {
                System.out.println("no hay");
            }
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
