package com.polimorfismoporherencia;

public class Test {
    public static void main(String[] args) {
        // por medio de la gerelizacion se pueden imprementar la clase Bicicleta y avion como objetos
        // o upcasting
        probar(new Vehiculo());
        probar(new Bicicleta());
        probar(new Avion());
    }

    public static void probar( Vehiculo v){
        v.encender();
    }
}
