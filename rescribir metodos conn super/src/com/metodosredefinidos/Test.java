package com.metodosredefinidos;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


        // en el Test se crea la lista y se agrega
        ArrayList<Bicicletas> bicis = new ArrayList<>();
        Taller taller = new Taller();

        bicis.add(new Bicicletas("xs", 167, 30));
        bicis.add(new Bicicletas("xs", 167, 51));
        bicis.add(new BicicletaElectrica("kl",300, 60, 300));
        bicis.add(new BicicletaElectrica("kl",300, 64, 300));

        System.out.println("La cantidad de servicios disponibles son: "+taller.cantidadServiciosPosibles(bicis));

    }
}
