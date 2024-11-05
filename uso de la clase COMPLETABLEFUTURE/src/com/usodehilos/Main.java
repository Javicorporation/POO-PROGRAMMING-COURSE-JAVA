package com.usodehilos;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        CompletableFuture<String> completableFuture1 = new CompletableFuture<>();

        // hilo 1
        Thread hilo1 = new Thread(() ->{
            try {
                Thread.sleep(6000);
                completableFuture.complete("El hilo 1 a terminado");
                //System.out.println("El hilo a terminado");
            }catch (InterruptedException e){
                completableFuture.completeExceptionally(e);
            }
        });

         // hilo 2
        Thread hilo2 = new Thread(() ->{
            try {
                Thread.sleep(12000);
                completableFuture1.complete("El hilo 2 a terminado");
            }catch (InterruptedException e){
                completableFuture.completeExceptionally(e);
            }
        });

        hilo1.start();
        hilo2.start();

        // -- puede arrojar una exception y debemos usar un try catch
        //completableFuture.get();

        try {
            String resultado = completableFuture.get();
            System.out.println(resultado);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

        try {
            String resultado1 = completableFuture1.get();
            System.out.println(resultado1);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }




    }
}
