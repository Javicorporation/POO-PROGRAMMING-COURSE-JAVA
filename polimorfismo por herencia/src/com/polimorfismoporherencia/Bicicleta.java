package com.polimorfismoporherencia;

public class Bicicleta extends Vehiculo{

    @Override
    public void encender(){
        System.out.println("se encendio la bicicleta");
    }

    public void prenderPantalla(){
        System.out.println("Pantalla prendida...");
    }

    public void energizarMotor(){
        System.out.println("Motor listo...");
    }
}
