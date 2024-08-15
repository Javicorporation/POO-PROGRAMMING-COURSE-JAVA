package com.foreach.test;

import com.foreach.clases.Auto;
import com.foreach.clases.Concesionario;

public class Test {
    public static void main(String[] args) {
        Concesionario consesionaria = new Concesionario("Juanin S.A");
        consesionaria.mostrarConcesionaria();
        System.out.println("***************************");



        consesionaria.agregarAuto(new Auto("RYRT37","verde"));
        consesionaria.agregarAuto(new Auto("RYRT37","azul"));
        consesionaria.agregarAuto(new Auto("RYRT37","rojo"));
        consesionaria.mostrarConcesionaria();



    }
}
