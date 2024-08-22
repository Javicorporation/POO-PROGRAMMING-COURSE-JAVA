package com.herencia.test;

import com.herencia.clases.Auto;
import com.herencia.clases.Moto;

public class Test {

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.frenar();

        Moto moto = new Moto();
        moto.acelerar();
        moto.getMarca();

    }
}
