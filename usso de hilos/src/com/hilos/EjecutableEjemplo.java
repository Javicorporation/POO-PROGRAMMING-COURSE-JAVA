package com.hilos;

public class EjecutableEjemplo implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("hola soy un ejecutable");
            Thread.sleep(6000);
            System.out.println("hola soy un ejecutable");


        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //super.run();
    }
}
