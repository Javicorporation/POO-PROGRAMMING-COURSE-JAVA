package com.excepcionessss;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);



        try {
            System.out.print("Ingrese el numero 1: ");
            int n1 = getting.nextInt();
            System.out.print("Ingrese el numero 2: ");
            int n2 = getting.nextInt();
            getting.nextLine();

            getting.close();
            int resultado = n1/n2;
            System.out.println(resultado);
        }catch (Exception e) {
            System.out.println("Ocurrio un error, ingrese solo numeros enteros.");
            e.printStackTrace();
        }
    }
}
