package com.programacionfuncinal;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Gasto> lista = new ArrayList<>();
        lista.add(new Gasto("A", 80));
        lista.add(new Gasto("B", 50));
        lista.add(new Gasto("C", 70));
        lista.add(new Gasto("D", 95));
        // logica normal de forma algo lineal
//        double acumulador = 0;
//
//        for (Gasto gasto : lista) {
//            if (gasto.getValor()*1.21 < 100) {
//                acumulador += gasto.getValor()*1.21;
//            }
//        }
//        System.out.println(acumulador);

        // usando programación funcional

        double resultaado = lista.stream()
                .mapToDouble( v -> v.getValor() *1.21)
                .filter( v -> v < 100).sum();

        System.out.println("el resultado es: " + resultaado);
    }
}
