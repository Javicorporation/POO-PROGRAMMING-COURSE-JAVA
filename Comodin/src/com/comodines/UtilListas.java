package com.comodines;

import java.util.List;
import java.util.Objects;

public class UtilListas {

    // el ? sirve para determinar que obtendremos una lista cualquiera
    public static void mostrarLista(List<?> lista) {
        for (Object x: lista){
            System.out.println(x);
        }

    }

}
