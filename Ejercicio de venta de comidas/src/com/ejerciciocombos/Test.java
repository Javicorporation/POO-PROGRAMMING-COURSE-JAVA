package com.ejerciciocombos;

public class Test {
    public static void main(String[] args) {

        Comedor comedor = new Comedor();
        comedor.agregarComida(new ComboDeComida("comboo familiar 1", 3.50));
        comedor.agregarComida(new ComboDeComida("comboo familiar 2", 5.50));
        comedor.agregarComida(new ComboDeComida("comboo familiar 3", 4.50));
        comedor.agregarComida(new ComboDeComida("comboo familiar 4", 6.50));
        comedor.agregarComida(new ComboDeComida("comboo familiar 5", 2.50));

        comedor.menu();
    }
}
