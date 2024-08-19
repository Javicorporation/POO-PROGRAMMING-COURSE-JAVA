package com.mayorymenorarraylist.Test;

import com.mayorymenorarraylist.Clases.Auto;
import com.mayorymenorarraylist.Clases.Consesionario;

public class Test {
    public static void main(String[] args) {

        Consesionario consesionario = new Consesionario();
        consesionario.agregarAuto(new Auto("YTREWU", "BLANCO", 4000));
        consesionario.agregarAuto(new Auto("FRTERT", "ROJO", 1003));
        consesionario.agregarAuto(new Auto("RTETRE", "NEGRO", 4000));
        consesionario.agregarAuto(new Auto("OIÑLIL", "VERDE", 2000));
        consesionario.agregarAuto(new Auto("NVBNHV", "AZUL", 3000));
        consesionario.agregarAuto(new Auto("QWEQWD", "CRIS", 4000));


        //System.out.println(" el auto con mayor kilometraje es: "+consesionario.autokilomMaximo());
        System.out.println();
        System.out.println(" el auto con mayor kilometraje es: "+consesionario.obtenerAutosConMayorKilo());
        System.out.println();
       // System.out.println(" el auto con menor kilometraje es: "+consesionario.autokilomMinimo());

    }
}
