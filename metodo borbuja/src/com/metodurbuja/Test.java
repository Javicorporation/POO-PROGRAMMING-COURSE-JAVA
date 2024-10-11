package com.metodurbuja;

public class Test {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0] = 100;
        numeros[1] = 24;
        numeros[2] = 13;
        numeros[3] = 46;
        numeros[4] = 51;
        numeros[5] = 36;
        numeros[6] = 72;
        numeros[7] = 28;
        numeros[8] = 9;

        for (int i = 0; i < numeros.length; i++) {
            int valor = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    valor = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = valor;
                }
            }

        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
