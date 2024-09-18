package com.ejerciciovarargs;

public class Test {
    public static void main(String[] args) {

        System.out.println(sumar("hola",4,8,9,6));
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
}
