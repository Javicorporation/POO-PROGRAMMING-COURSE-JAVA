package com.foreach.clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Concesionario {

    private String nombre;
    private ArrayList<Auto> autos; // autos es nulll

    public Concesionario(String nombre) {
        this.nombre = nombre;
        // siempre instancia la lista en el constructor por que sino se quedara null
        this.autos = new ArrayList< >();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarConcesionaria() {
        if (autos.isEmpty()){
            System.out.println("No hay autos");
        } else {
            // for normal
//            for (int i = 0; i < autos.size(); i++) {
//                System.out.println(autos.get(i));
//            }
            for (Auto a : autos){
                System.out.println(a);
            }
        }
    }

    private double sumatoriaKilo(){
        double sumatoria = 0;
        for (Auto auto : autos){
            sumatoria+=auto.getKilometroR();
        }
        return sumatoria;
    }

    public double promedioKilometrosRe(){
        double promedio = 0;
        if (autos.isEmpty()){
            return promedio;
        }
        double sumatoria = sumatoriaKilo();
        return  sumatoria/autos.size();

    }

    public Auto buscarAuto(String patente){
        Auto autoEncontrado = null;
        Iterator<Auto> iterator = autos.iterator();

        /*
        for (Auto auto : autos){
            System.out.println("hghgh");
            if (auto.getModelo().equalsIgnoreCase(patente)) {
                autoEncontrado = auto;
            }
        }*/
        int i = 0;
        while (iterator.hasNext() && autoEncontrado == null){
            Auto a = iterator.next();
            if (a.getModelo().equalsIgnoreCase(patente)) {
                autoEncontrado = a;
            }
        }
        return autoEncontrado;

    }





    //////////////////////////////////////
    public void agregarAuto(Auto auto) {
        this.autos.add(auto);
    }
}
