package com.ejercicioAsientos;

import java.util.Scanner;

public class ReservaAcientos {
    public static void main(String[] args) {

        // creamos la matris
        char acientos [][] = new char[10][10];
        boolean loop = false;
        Scanner gettin = new Scanner(System.in);
        int fila = 0;
        int asiento = 0;
        String respuesta;


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                acientos[i][j] = 'L';
            }

        }

        System.out.println("------ Asientos-------");
        // creación de bucle que permite la optencion de datos
        while (!loop){
            System.out.println("estos son los asientos vacios");
            String opcion = gettin.nextLine();
            if (opcion.equalsIgnoreCase("si")){

            }
            verAsientosVacios(acientos);
            // reserva
            boolean estaBien = false;
            while (!estaBien) {
                System.out.println("Ingrese fila y asiento a reservar");
                System.out.print("Fila debe ser ente 0 y 9: ");
                fila = gettin.nextInt();
                System.out.print("asiento debe ser ente 0 y 9: ");
                asiento = gettin.nextInt();

                if (fila <= 9 && fila >= 0){
                    if (asiento <= 9 && asiento >= 0) {
                        estaBien = true;
                    }else {
                        System.out.println("la fila debe ser entre 0 y 9");
                    }
                }else {
                    System.out.println("El numero de haciento esta mal");
                }
            }


            if (acientos[fila][asiento] == 'L'){
                acientos[fila][asiento] = 'X';
                System.out.println("el asiento fue reservado con exito");
            }else {
                System.out.println("el asiento esta reservado, pida otro");
            }
            System.out.println("Deseas finalizar la reserva?: S si, Nno");
            respuesta = gettin.next();
            if (respuesta.equalsIgnoreCase("S")){
                loop = true;
            }



        }


    }

    public static void verAsientosVacios(char asientos[][]){
        for (int i = 0; i < 10; i++) {
            System.out.print(i +". ");
            for (int j = 0; j < 10; j++) {
                System.out.print("["+asientos[i][j]+"] ");
            }
            System.out.println("");
        }

    }
}
