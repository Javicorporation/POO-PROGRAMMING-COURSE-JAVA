package com.tricach;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        }catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
        System.out.println("Bye");
    }
}
