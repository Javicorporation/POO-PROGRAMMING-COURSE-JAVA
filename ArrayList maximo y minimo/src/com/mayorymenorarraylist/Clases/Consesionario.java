package com.mayorymenorarraylist.Clases;

import java.util.ArrayList;

public class Consesionario {

    ArrayList<Auto> autos = new ArrayList<>();


    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    public Auto autokilomMaximo(){
        int maxKilo = -1;
        Auto maxAuto = null;
        for (Auto auto : autos) {
            if (auto.getKilometraje() > maxKilo) {
                maxKilo = auto.getKilometraje();
                //System.out.println(maxKilo);
                maxAuto = auto;
            }
        }
        return maxAuto;
    }


    public Auto autokilomMinimo(){
        int minKilo = Integer.MAX_VALUE;
        Auto minAuto = null;
        for (Auto auto : autos) {
            if (auto.getKilometraje() < minKilo) {
                minKilo = auto.getKilometraje();
                //System.out.println(minKilo);
                minAuto = auto;
            }
        }
        return minAuto;
    }
}
