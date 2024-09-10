package com.ejercicioAsientos;

import java.util.Scanner;

public class ReservaAcientos {
    public static void main(String[] args) {

        // creamos la matris
        char acientos [][] = new char[10][10];
        boolean loop = false;
        Scanner gettin = new Scanner(System.in);
        int fila, aciento;
        String respuesta;


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                acientos[i][j] = 'L';
            }

        }

        System.out.println("------ Asientos-------");
        // creación de bucle que permite la optencion de datos
        while (!loop){
            System.out.println("Ingrese fila y asiento a reservar");
            System.out.print("Fila debe ser ente 0 y 9: ");
            fila = gettin.nextInt();
            System.out.print("asiento debe ser ente 0 y 9: ");
            fila = gettin.nextInt();

            if (acientos[fila][fila] == 'L'){
                acientos[fila][fila] = 'X';
                System.out.println("el asiento fue reservado con exito");
            }else {
                System.out.println("el asiento esta reservado, pida otro");
            }
            System.out.println("Deseas seguir reservando?: S si, Nno");
            respuesta = gettin.next();
            if (respuesta.equalsIgnoreCase("S")){
                loop = true;
            }

        }


    }
}
