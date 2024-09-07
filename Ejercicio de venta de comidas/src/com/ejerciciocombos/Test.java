package com.ejerciciocombos;

import java.util.Scanner;

public class Test {
    public static Scanner getting = new Scanner(System.in);
    public static void main(String[] args) {


//        Comedor comedor = new Comedor();
//        comedor.agregarComida(new ComboDeComida("comboo familiar 1", 3.50));
//        comedor.agregarComida(new ComboDeComida("comboo familiar 2", 5.50));
//        comedor.agregarComida(new ComboDeComida("comboo familiar 3", 4.50));
//        comedor.agregarComida(new ComboDeComida("comboo familiar 4", 6.50));
//        comedor.agregarComida(new ComboDeComida("comboo familiar 5", 2.50));
//
//        comedor.menu();

        metodo();

    }

    public static void metodo(){
        boolean continuar = false;
        int numero1 = 0;
        do {
            System.out.println("presione 2 si quiere salir del primer2 bucle");
            System.out.print("ingrese un numero del primer bucle: ");
            numero1 = getting.nextInt();

            switch(numero1){
                case 1:
                    metodo2();
                    break;
                case 2:
                    System.out.println("adios");
                    continuar = true;
                    break;
                default:
                    System.out.println("salio del segundo bucle");
            }

        }while (!continuar);
    }

    public static void metodo2(){
        boolean continuar = false;
        int numero1 = 0;
        do {
            System.out.println("presione 2 si quiere salir del segundo bucle");
            System.out.print("ingrese un numero del segundo bucle: ");
            numero1 = getting.nextInt();

            switch(numero1){
                case 1:
                    System.out.println("segundo bucle");
                    break;
                case 2:
                    System.out.println("adios del segundo bucle");
                    continuar = true;
                    break;
                default:
                    System.out.println("salio del segundo bucle");
            }

        }while (!continuar);
    }
}
