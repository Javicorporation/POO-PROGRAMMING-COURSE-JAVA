package com.persistencia.principal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List lista1 = new ArrayList();
        lista1.add(1);
        lista1.add("hola");
        lista1.add(25);
        lista1.add(11.23);

        for (Object o : lista1) {
            System.out.println(o);
        }
    }
}
