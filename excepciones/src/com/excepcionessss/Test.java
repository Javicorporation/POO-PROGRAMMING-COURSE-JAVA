package com.excepcionessss;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        boolean loop = false;


        do {
            try {
                System.out.print("Ingrese el numero 1: ");
                int n1 = getting.nextInt();
                System.out.print("Ingrese el numero 2: ");
                int n2 = getting.nextInt();
                getting.nextLine();

                getting.close();
                int resultado = n1/n2;
                System.out.println(resultado);
                loop = true;
            }catch (InputMismatchException e) {
                System.out.println("Ocurrio un error, ingrese solo numeros enteros.");
                e.printStackTrace();
                getting.nextLine();
            }catch (ArithmeticException e){
                System.out.println("Ocurrio un error, ino se puede dividir entre 0.");
            }finally {
                getting.nextLine();
                getting.close();

            }
        }while (!loop);

    }
}
