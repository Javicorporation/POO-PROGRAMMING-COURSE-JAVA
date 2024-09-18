package com.generarpass;

public class Test {
    public static void main(String[] args) {

        System.out.println(generarPass());
    }

    public static String generarPass() {
        char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F'};
        char[] minusculas = {'a', 'b', 'c', 'd', 'e', 'f'};
        char[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            int cantidadCaracteres = caracteres.length();
            int numeroRam = (int) (Math.random() * cantidadCaracteres);
            password.append(caracteres.toString().charAt(numeroRam));
        }
        return password.toString();
    }
}
