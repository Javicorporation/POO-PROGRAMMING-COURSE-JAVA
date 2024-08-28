package com.metodosredefinidos;

import java.util.ArrayList;

public class Taller {

    public int cantidadServiciosPosibles(ArrayList<Bicicletas> listaServi){
        int cantidadServicios = 0;
        for (Bicicletas bicicletas : listaServi){
            if (bicicletas.servicioUsable()) {
                cantidadServicios++;
            }
        }

        return cantidadServicios;
    }
}
