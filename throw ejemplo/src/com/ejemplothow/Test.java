package com.ejemplothow;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int y ,z;
        System.out.print("Ingrese y: ");
        y = new Scanner(System.in).nextInt();
        z = new Caalculo().factorial(y);
        System.out.println("Resultado: "+z);
        System.out.println("adios");
    }
}
