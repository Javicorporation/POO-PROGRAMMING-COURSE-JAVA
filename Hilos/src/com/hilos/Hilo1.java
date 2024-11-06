package com.hilos;

public class Hilo1 extends Thread {

    @Override
    public void run() {
        System.out.println("Hola desde el hilo 1");
    }
}
