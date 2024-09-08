package com.ejerciciocombos;

import java.util.Scanner;

public class Test {
    public static Scanner getting = new Scanner(System.in);
    public static void main(String[] args) {

        Comedor comedor = new Comedor();
        comedor.agregarComida(new ComboDeComida("Combo Familiar", 3.50));
        comedor.agregarComida(new ComboDeComida("Combo Estudiantil", 5.50));
        comedor.agregarComida(new ComboDeComida("Combo Univertitario", 4.50));
        comedor.agregarComida(new ComboDeComida("Combo MegaBox", 6.50));
        comedor.agregarComida(new ComboDeComida("Combo Básico", 2.50));

        comedor.menu();
    }
}
