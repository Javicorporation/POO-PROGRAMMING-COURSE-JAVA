package com.ejerciciovarargs;

public class Test {
    public static void main(String[] args) {

        //System.out.println(sumar("hola",4,8,9,6));
        ejemplo();
    }
                                            // el parametro indefinido siempre va al final de todo
    public static int sumar(String nombre, int... numeros){
        System.out.println(nombre);
        int suma = 0;
        for (int num : numeros){
            suma += num;
        }
        return suma;
    }

    public static void ejemplo(){
        StringBuilder vacio = new StringBuilder();
        System.out.println(vacio);

        vacio.append("hola ");
        vacio.append("que tal");
        vacio.deleteCharAt(vacio.length()-1);
        vacio.reverse();
        vacio.appendCodePoint(1);
        System.out.println(vacio);
    }
}
