package com.herencia.clases;

public class Auto extends Vehiculo{
    boolean tieneAire;

    void prenderAire(){
        if (tieneAire){
            System.out.println("encendido..");
        }
    }
}
