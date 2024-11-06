package com.hilos;

public class Main {

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();

        System.out.println(hilo1.getState().name());
        hilo1.start();


        System.out.println(hilo1.getState().name());



        // creacion del hilo 2
         Thread hilo2 = new Thread(new Hilo2());
         hilo2.start();

         System.out.println("Hola");
    }
}
