package com.araylistobjetos.test;

import com.araylistobjetos.clases.Auto;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        Auto a1 = new Auto("FGJH","verde");
//        Auto a2 = new Auto("FGJH","verde");
//        Auto a3 = new Auto("FGJH","verde");
        ArrayList<Auto> autos = new ArrayList<>();
        System.out.println("****************************************");
        autos.add(new Auto("FGJH","verde"));
        System.out.println(autos.size());
        System.out.println(autos);

        System.out.println("****************************************");
        autos.add(new Auto("FGJH","verde"));
        System.out.println(autos.size());
        System.out.println(autos);

        System.out.println("****************************************");
        autos.add(new Auto("FGJH","verde"));
        System.out.println(autos.size());
        System.out.println(autos);
        System.out.println();
        System.out.println("el segundo auto de la lista es: ");
        System.out.println(autos.get(2));
        System.out.println(autos.remove(0));
        System.out.println(autos);


    }
}
