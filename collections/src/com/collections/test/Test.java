package com.collections.test;

import com.collections.clases.Auto;
import com.collections.clases.Concesionaria;

public class Test {
    public static void main(String[] args) {
        Concesionaria consesionaria = new Concesionaria("Juanin S.A");
        consesionaria.mostrarConcesionaria();
        System.out.println("***************************");



        consesionaria.agregarAuto(new Auto("RYRT37","verde"));
        consesionaria.agregarAuto(new Auto("RYRT37","azul"));
        consesionaria.agregarAuto(new Auto("RYRT37","rojo"));
        consesionaria.mostrarConcesionaria();



    }
}
