package com.distribusiondelogica;

public class Principal {
    public static void main(String[] args) {
        Motor motor = new Motor("543276",20, "deportivo");
        Auto auto1 = new Auto("dgfgdsjhf","Toyota",32000, "verde",motor);

        System.out.println(auto1);
        auto1.acelerar();
        System.out.println(auto1);
    }
}
