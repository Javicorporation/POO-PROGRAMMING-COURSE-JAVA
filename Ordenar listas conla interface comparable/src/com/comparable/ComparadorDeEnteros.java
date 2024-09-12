package com.comparable;

import java.util.Comparator;

public class ComparadorDeEnteros implements Comparator<Integer> {

    // logica para validar si es desendente o ascendente
    // solo lo he implementado en datos enteros
    int multiplicador;
    public ComparadorDeEnteros(boolean desendente) {
        if (desendente) multiplicador = 1;
        else multiplicador = -1;
    }
    @Override
    public int compare(Integer o1, Integer o2) {
        // de forma ascendente
        //         return o2 - o1;
        // de forma decendente
        return multiplicador * ( o1 - o2 );
    }
}
