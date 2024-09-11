package com.comodines;

import java.util.List;
import java.util.Objects;

public class UtilListas {

    // consumidores de lista
    // el ? sirve para determinar que obtendremos una lista cualquiera
    public static void mostrarLista(List<?> lista) {
        for (Object x: lista){
            System.out.println(x);
        }

    }

    // proveedor de lista
    // obtendremos los objetos que extiendan o herreden de personas
    public static void mostrarListaDePersonas(List<? extends Persona> lista) {
        for (Persona p: lista){
            System.out.println(p.mostrarNombres());
        }
    }

    public static void agregarDeportistaALista(List<? super Deportista> lista, String nom, String ape, int ene) {

        Deportista deportista = new Deportista(nom, ape, ene);
        lista.add(deportista);
    }

}
