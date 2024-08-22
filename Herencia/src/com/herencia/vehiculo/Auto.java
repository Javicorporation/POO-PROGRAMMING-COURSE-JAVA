package com.herencia.vehiculo;

public class Auto extends Vehiculo {
    boolean tieneAire;

    void prenderAire(){
        if (tieneAire){
            System.out.println("encendido..");
        }
    }
}
