package com.javalistmap.test;

import com.javalistmap.model.Coche;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        Coche modelo1 = new Coche("Y1Yaris", "Toyota", 16000);
        Coche modelo2 = new Coche("Y2Yaris", "Toyota", 20000);
        Coche modelo3 = new Coche("Y3Yaris", "Toyota", 22000);

        List<Coche> coches = Arrays.asList(modelo1, modelo2, modelo3);

        // para muscar un objeto por medio de su id
        Optional<Coche> optional = coches.stream()
                .filter(m -> m.getIdentificador().equals("Y1Yaris")).findFirst();
        if (optional.isPresent()) {
            System.out.println(optional.get().getIdentificador());
            System.out.println(optional.get().getMarca());
            System.out.println(optional.get().getPrecio());
        }
    }
}
