package com.comparable;

import java.util.Comparator;

public class ComparadorDeEnteros implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // de forma ascendente
        //         return o2 - o1;
        // de forma decendente
        return o1 - o2;
    }
}
