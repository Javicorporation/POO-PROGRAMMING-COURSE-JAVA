package com.peliculas.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> meses = new ArrayList<>();
        meses.add("M");
        meses.add("F");
        meses.add("H");

        for (String dato : meses) {
            System.out.println(dato);
        }

        // esta sseria otra forma de usar el foreach
        meses.forEach(System.out::println);

        //System.out.println(meses);
    }
}
