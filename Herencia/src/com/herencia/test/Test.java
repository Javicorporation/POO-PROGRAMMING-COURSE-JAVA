package com.herencia.test;

import com.herencia.clases.Concesionaria;
import com.herencia.vehiculo.Auto;
import com.herencia.vehiculo.Moto;
import com.herencia.vehiculo.Vehiculo;

public class Test {

    public static void main(String[] args) {
//        Vehiculo vehiculo = new Vehiculo("x","conpacto", "TYDVEHEH");
//        Auto auto = new Auto("Toyota","6534732", "CBNVHD", true);
////        auto.frenar();
////        System.out.println(auto);
//        Moto moto = new Moto("Toyota","6534732", "CBNVHD", 23);
////        moto.acelerar();
////        moto.getMarca();
////        System.out.println(moto);
//        Vehiculo auto2 = new Auto("Toyota","6534732", "CBNVHD", true);

        Concesionaria c = new Concesionaria();
        c.agregarVehiculo(new Auto("Toyota","6534732", "CBNVHD", true));
        c.agregarVehiculo(new Moto("Toyota","6534732", "CBNVHD", 23));
    }
}
