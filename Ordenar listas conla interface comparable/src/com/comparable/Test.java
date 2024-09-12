package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> letras = new ArrayList<>();
        letras.add("r");
        letras.add("d");
        letras.add("h");
        letras.add("u");
        letras.add("b");

        ArrayList<Integer> numeroList = new ArrayList<>();
        numeroList.add(13);
        numeroList.add(72);
        numeroList.add(34);
        numeroList.add(41);
        numeroList.add(5);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(12, "Juanin", "zaz",1.67));
        personas.add(new Persona(2, "Maria", "paz",1.47));
        personas.add(new Persona(22, "Julia", "caz",1.77));
        personas.add(new Persona(42, "Carla", "daz",1.61));

        // ordenar listas con Collections y su método sort
//        Collections.sort(letras);
//        mostraLista(letras);

        Collections.sort(personas);
        mostraLista(personas);
    }


    // metodo comodin para listas
    public static void mostraLista (List<?> lista){
        for (Object x: lista){
            System.out.println(x);
        }
    }
}
