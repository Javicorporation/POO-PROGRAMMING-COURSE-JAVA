package com.genericos;

public class Test {
    public static void main(String[] args) {
        Sorteador<String> sorteador = new Sorteador<>();

    }
    public static void retardo(int s) {
        try {
            Thread.sleep(s * 1000);
        }catch (Exception e) {
            System.out.println("Error de concurrencia: "+e.getMessage());
        }
    }
}
