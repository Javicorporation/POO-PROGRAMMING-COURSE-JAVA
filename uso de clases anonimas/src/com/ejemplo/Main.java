package com.ejemplo;

public class Main {
    public static void main(String[] args) {

        new Vehiculo(){
            private int numeroDePasajeros;

            public void conducir(){
                System.out.println("Estoy conduciendo");
            }
        };
    }
}
