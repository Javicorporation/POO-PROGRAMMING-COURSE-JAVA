package com.polimorfismoporherencia;

public class Avion extends Vehiculo{

    @Override
    public void encender(){
        System.out.println("se encendio el avion");
    }

    public void calefaccionarCarburador(){
        System.out.println("Carburador listo...");
    }

    public void regularMezclaDeCobustible(){
        System.out.println("Mezcla regulada...");
    }

    public void inyectarConbustible(){
        System.out.println("Conbustible inyectado...");
    }

    public void masPasos(){
        System.out.println("Mas pasos...");
    }
}
