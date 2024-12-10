package com.usudeRunnable;

public class main {
    public static void main(String[] args) {

//        Tarea tarea =  new Tarea();
//        tarea.run();

        Thread t2 = new Thread(main :: procesar);
        t2.start();


    }

    public static void procesar(){
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
