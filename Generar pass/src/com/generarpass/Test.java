package com.generarpass;

import java.security.SecureRandom;

public class Test {

    //definicion de arrays constantes
    private static final char[] MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] MINUSCULAS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] NUMEROS = "0123456789".toCharArray();
    private static final char[] CARACTERES_ESPECIALES = "!@#$%^&*()-_=+[]{}|;:,.<>?/`~".toCharArray();

    public static void main(String[] args) {
        int longitud = 15;
        String password = generarPass(longitud, true, true, true, true);
        System.out.println(password);

    }

    public static String generarPass(int longitud, boolean mayusculas, boolean minusculas, boolean numeros, boolean caracteresEspeciales) {
        StringBuilder caracteres = new StringBuilder();

        if (mayusculas) {
            caracteres.append(MAYUSCULAS);
        }
        if (minusculas) {
            caracteres.append(MINUSCULAS);
        }
        if (numeros) {
            caracteres.append(NUMEROS);
        }
        if (caracteresEspeciales) {
            caracteres.append(CARACTERES_ESPECIALES);
        }
        if(caracteres.length() == 0){
            throw new IllegalArgumentException("El caracter no puede estar vacio");
        }
        // uso de secureRandom
        SecureRandom random = new SecureRandom();
        // uso de StringBuilder
        StringBuilder password = new StringBuilder();
        // recorremos la longitud pasada por parametro
        for (int i = 0; i < longitud; i++) {
            int indexaleatorio = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(indexaleatorio));
        }
        return password.toString();
    }
}
