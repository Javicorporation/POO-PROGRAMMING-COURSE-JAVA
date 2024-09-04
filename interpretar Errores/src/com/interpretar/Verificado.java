package com.interpretar;

public class Verificado {

    public static void checkEsNegativo(int x){
        if (x < 0){
            throw new RuntimeException("La edad no puede ser negativo");
        }
    }
}
