package com.metodurbuja;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<Persona>();
        personas.add( new Persona( 124,"maria", "cruz"));
        personas.add( new Persona( 35,"carla", "cruz"));
        personas.add( new Persona( 8,"luisa", "cruz"));
        personas.add( new Persona( 3,"mirian", "cruz"));
        personas.add( new Persona( 54,"carlota", "cruz"));


        System.out.println(personas);
        System.out.println("-----------------");
        int leng = personas.size();
        for (int i = 0; i < leng - 1; i++) {
            for (int j = 0; j < leng - 1; j++) {

                if (personas.get(i).getId() > personas.get(j+1).getId()) {
                    Persona temp = personas.get(j);
                    personas.set(j, personas.get(j + 1));
                    personas.set(j + 1, temp);
                }
            }
        }
        System.out.println(personas);








//        int[] numeros = new int[10];
//        numeros[0] = 100;
//        numeros[1] = 24;
//        numeros[2] = 13;
//        numeros[3] = 46;
//        numeros[4] = 51;
//        numeros[5] = 36;
//        numeros[6] = 72;
//        numeros[7] = 28;
//        numeros[8] = 9;
//
//        for (int i = 0; i < numeros.length; i++) {
//            int valor = 0;
//            for (int j = 0; j < numeros.length; j++) {
//                if (numeros[i] < numeros[j]) {
//                    valor = numeros[i];
//                    numeros[i] = numeros[j];
//                    numeros[j] = valor;
//                }
//            }
//
//        }
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }
    }
}
