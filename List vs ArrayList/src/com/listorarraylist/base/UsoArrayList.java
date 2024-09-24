package com.listorarraylist.base;

import java.util.ArrayList;

public class UsoArrayList {
    public void usoDeArrayList(){
        ArrayList<String> listaletras = new ArrayList<>();
        listaletras.add("A");
        listaletras.add("B");
        listaletras.add("C");
        listaletras.add("D");
        listaletras.add("E");

        for (String a : listaletras) {
            System.out.println(a);
        }
    }
}
