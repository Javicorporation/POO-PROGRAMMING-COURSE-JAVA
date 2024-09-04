package com.tricach;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        }catch (InputMismatchException e){
            System.out.println("no es un entero");
        }catch (ArithmeticException e){
            System.out.println("no se puede dividir por 0");
        }catch (Exception e){
            System.out.println("Error "+ e.getMessage()+" ");
            e.printStackTrace(System.out);
        }
        System.out.println("Bye");
    }
}
