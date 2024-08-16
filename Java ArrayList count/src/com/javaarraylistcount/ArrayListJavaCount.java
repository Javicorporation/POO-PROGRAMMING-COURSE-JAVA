package com.javaarraylistcount;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListJavaCount {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("hola");
        list.add("ghjf");
        list.add("jgrj");
        list.add("hola");
        list.add("Hola");

        int contador = 0;

        // obtener la cantidad de hola, por medio de el for
        /*
        for(String s : list) {
            if (s.equals("hola")) {
                contador++;
            }
        }
        System.out.println("La cantidad de hola, es: "+contador);
        */

        // obtener la cantidad de hola, por medio de la API stream
        //System.out.println(list.stream().filter(t -> t.equalsIgnoreCase("hola")).count());


        // obtener la cantidad de hola, por medio de método frequency de la clase Collections
        System.out.println(Collections.frequency(list,"hola".toLowerCase()));


    }
}
