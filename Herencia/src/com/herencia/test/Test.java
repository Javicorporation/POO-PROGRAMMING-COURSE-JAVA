package com.herencia.test;

import com.herencia.vehiculo.Auto;
import com.herencia.vehiculo.Moto;

public class Test {

    public static void main(String[] args) {
        Auto auto = new Auto("Toyota","6534732", "CBNVHD", true);
        auto.frenar();
        System.out.println(auto);

        Moto moto = new Moto("Toyota","6534732", "CBNVHD", 23);
        moto.acelerar();
        moto.getMarca();
        System.out.println(moto);

    }
}
