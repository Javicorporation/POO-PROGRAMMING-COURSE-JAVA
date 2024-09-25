package com.usodeiterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterador {

    public static void main(String[] args) {
        usoIterator();
        System.out.println();
//        usoforeach();


    }

    public static void usoIterator(){
        List<String> listacadenas = new ArrayList<String>();
        listacadenas.add("hola");
        listacadenas.add("que tal");
        listacadenas.add("como estas");
        listacadenas.add("todo bien");

        Iterator<String> iterador = listacadenas.iterator();
        while (iterador.hasNext()) {
            String nombre = iterador.next();
            if (nombre.equals("hola")) {
                iterador.remove();
            }
        }

        for (String nombre : listacadenas) {
            System.out.println(nombre);
        }
    }


//    public static void usoforeach(){
//        List<String> listacadenas = new ArrayList<String>();
//        listacadenas.add("hola");
//        listacadenas.add("que tal");
//        listacadenas.add("como estas");
//        listacadenas.add("todo bien");
//
//        for (String valor : listacadenas) {
//            if (valor.equals("hola")) {
//                listacadenas.remove(valor);
//            }
//        }
//    }


}







