package com.convertidor;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        boolean loop = false;


        while (!loop) {
            System.out.println("Conversor de moneda a dolares");
            System.out.println("1. soles peruanos a dolares\n"+
                    "2. solesmexicanos a dolares akiamare\n"+
                    "3. soles colombianos a dolares\n"+
                    "4. salir\n");

            System.out.println("Escribe una opcion: ");
            int opcion = getting.nextInt();

            switch (opcion) {
                case 1:
                    convertir(3.58, "soles peruanos");
                    break;
                case 2:
                    convertir(22.15, "soles mexicanos");
                    break;
                case 3:
                    convertir(3851.90, "soles colombians");
                    break;
                case 4:
                    System.out.println("adios");
                    loop = true;
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;

            }

        }
    }


    public static void convertir(double valorDolar, String pais){
        Scanner getting = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de %s: "+ pais);
        double cantidadMoneda = getting.nextDouble();

        double dolares = cantidadMoneda / valorDolar;
        dolares = (double) Math.round(dolares*100)/100;

        System.out.println("La cantidad de moneda es: $" + dolares);
    }
}
