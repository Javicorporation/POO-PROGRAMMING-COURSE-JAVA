package com.usudeRunnable;

public class Tarea implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tarea A-"+i);
        }
    }
}
