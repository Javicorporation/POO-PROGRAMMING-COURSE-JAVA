package com.mayorymenorarraylist.Clases;

import java.util.ArrayList;
import java.util.List;

public class Consesionario {

    ArrayList<Auto> autos = new ArrayList<>();


    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

//    public Auto autokilomMaximo(){
//        int maxKilo = -1;
//        Auto maxAuto = null;
//        for (Auto auto : autos) {
//            if (auto.getKilometraje() > maxKilo) {
//                maxKilo = auto.getKilometraje();
//                //System.out.println(maxKilo);
//                maxAuto = auto;
//            }
//        }
//        return maxAuto;
//    }



//    public Auto autokilomMinimo(){
//        int minKilo = Integer.MAX_VALUE;
//        Auto minAuto = null;
//        for (Auto auto : autos) {
//            if (auto.getKilometraje() < minKilo) {
//                minKilo = auto.getKilometraje();
//                //System.out.println(minKilo);
//                minAuto = auto;
//            }
//        }
//        return minAuto;
//    }


    // guardar los autos  con mayor kilometraje con una sola recorrida del arrayList
    public List<Auto> obtenerAutosConMayorKilo() {
        ArrayList<Auto> listaAutos = new ArrayList<>();
        int maxKilo = -1;
        for (Auto auto : autos) {
            if (auto.getKilometraje() == maxKilo){
                listaAutos.add(auto);
            }
            else if (auto.getKilometraje() > maxKilo) {
                maxKilo = auto.getKilometraje();
                listaAutos.clear();
                listaAutos.add(auto);
            }
        }
        return listaAutos;
    }
}
