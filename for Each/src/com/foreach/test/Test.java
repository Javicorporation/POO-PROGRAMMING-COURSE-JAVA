package com.foreach.test;

import com.foreach.clases.Auto;
import com.foreach.clases.Concesionario;

public class Test {
    public static void main(String[] args) {
        Concesionario consesionaria = new Concesionario("Juanin S.A");
        consesionaria.mostrarConcesionaria();
        System.out.println("***************************");



        consesionaria.agregarAuto(new Auto("RYRT37","verde",203));
        consesionaria.agregarAuto(new Auto("RYRT37","azul",300));
        consesionaria.agregarAuto(new Auto("RYRT37","rojo",400));
        consesionaria.mostrarConcesionaria();
        System.out.println();
        System.out.println("promedio de kilometros: "+consesionaria.promedioKilometrosRe());



    }
}
