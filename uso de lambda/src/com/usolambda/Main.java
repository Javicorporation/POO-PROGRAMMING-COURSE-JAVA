package com.usolambda;

public class Main {
    public static void main(String[] args) {

        new Ejecutor(){
            @Override
            public void ejecutar() {

            }
        };

        Ejecutor lambda = () -> System.out.println("Hola desde la clase anonima");



    }
}
