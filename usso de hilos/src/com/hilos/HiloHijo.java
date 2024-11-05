package com.hilos;

public class HiloHijo extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("hola soy un Hilo");
            Thread.sleep(4000);
            System.out.println("hola soy un Hilo");


        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //super.run();
    }
}
