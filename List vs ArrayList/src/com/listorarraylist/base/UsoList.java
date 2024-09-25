package com.listorarraylist.base;

import java.util.ArrayList;
import java.util.List;

public class UsoList {


    public void usoDeArrayList(){
        List<String> listaletras = new ArrayList<>();
        listaletras.add("A");
        listaletras.add("B");
        listaletras.add("C");
        listaletras.add("D");
        listaletras.add("E");
        listaletras.add("F");

        for (String a : listaletras) {
            System.out.println(a);
        }
    }

}
