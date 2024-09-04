package com.ejemplothow;

public class Caalculo {
    public int factorial(int n) {
        if (n <0){
            throw  new RuntimeException("no se puede calcular factorial");
        }
        if (n > 12) {
            throw new IllegalArgumentException("no se puede obtener factorial a partir de 12");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
