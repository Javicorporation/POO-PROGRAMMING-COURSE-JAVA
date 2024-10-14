package com.practica;

public class Test {
    public static void main(String[] args) {

//        // ejemplo de dividir por 0
//        try {
//            int resultado = 3/0;
//        }catch (Exception e) {
//            System.out.println(e);
//        }

        int[] edades = {12, 12,32, 34};

        try {
            System.out.println("la edad es "+ edades[3]);

        }catch (Exception e) {
            System.out.println("no existe posicion");
            System.out.println(e);
        }

    }
}
