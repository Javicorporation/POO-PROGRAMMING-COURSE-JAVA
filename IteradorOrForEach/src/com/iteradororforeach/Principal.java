package com.iteradororforeach;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        ejemplo();
    }


    public static void ejemplo (){
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("juanin");
        nombres.add("licia");
        nombres.add("carmen");
        nombres.add("luis");
        nombres.add("maria");
        nombres.add("mario");


        // creamos un iterador de tipo String y iteramos la lista nombres de manera secuencial
                              // este metodo .iterator() nos devuelve un iterador para la lista de nombres
        Iterator<String> it = nombres.iterator();
        // mientras existan mas elementos en la lista que no han sido iterados retorna true y si no hay mas retorna false

        while(it.hasNext()){
            String nombre = it.next();
            if(nombre.equals("juanin")){
                it.remove();
            }else {
                System.out.println(nombre);
            }
        }

        // usando un foreach
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}
