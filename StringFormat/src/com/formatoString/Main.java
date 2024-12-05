package com.formatoString;

public class Main {
    public static void main(String[] args) {
        int edad = 25;
        float altura = 1.70f;
        double valorDePi = 3.1415;
        long distancia = 1500;
        boolean isDay = false;
        char miInicial = 'e';
        String j = "Jaime";


        System.out.println(String.format("Mi edad es: %d , y tiene %d", edad,edad));
        System.out.println(String.format("Mi altura es: %.2f", altura));
        System.out.println(String.format("Mi valor de Pi: %f", valorDePi));
        System.out.println(String.format("Mi distancia es: %d", distancia));
        System.out.println(String.format("Mi isDay: %b", isDay));
        System.out.println(String.format("Mi miInicial: %c", miInicial));
        System.out.println(String.format("Mi nombre es: %s", j));



    }
}
