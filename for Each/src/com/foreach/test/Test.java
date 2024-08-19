package com.foreach.test;

import com.foreach.clases.Auto;
import com.foreach.clases.Concesionario;

public class Test {
    public static void main(String[] args) {
        //Concesionario consesionaria = new Concesionario("Juanin S.A");
        Concesionario concesionario = new Concesionario("Juanin S.A");
        concesionario.agregarAuto(new Auto("YTREWU", "BLANCO", 4000));
        concesionario.agregarAuto(new Auto("FRTERT", "ROJO", 1003));
        concesionario.agregarAuto(new Auto("RTETRE", "NEGRO", 4000));
        concesionario.agregarAuto(new Auto("OIÑLIL", "VERDE", 2000));
        concesionario.agregarAuto(new Auto("NVBNHV", "AZUL", 3000));
        concesionario.agregarAuto(new Auto("QWEQWD", "CRIS", 4000));


        Auto a = concesionario.buscarAuto("RTETRE");
        if (a == null) {
            System.out.println("Auto no encontrado");
        }else {
            System.out.println("Auto encontrado"+ a);
        }





//        consesionaria.mostrarConcesionaria();
//        System.out.println("***************************");
//
//        consesionaria.agregarAuto(new Auto("RYRT37","verde",203));
//        consesionaria.agregarAuto(new Auto("RYRT37","azul",300));
//        consesionaria.agregarAuto(new Auto("RYRT37","rojo",400));
//        consesionaria.mostrarConcesionaria();
//
//        System.out.println();
//        System.out.println("promedio de kilometros: "+consesionaria.promedioKilometrosRe());
    }
}
