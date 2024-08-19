package com.collectionsylistas.teste;

import com.collectionsylistas.clasess.Factura;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.spi.ToolProvider.findFirst;

public class Test {
    public static void main(String[] args) {
        Factura f= new Factura("ordenador",1200);
        Factura f2= new Factura("movil",300);
        Factura f3= new Factura("impresora",200);
        Factura f4= new Factura("imac",1500);

        List<Factura> lista= new ArrayList<>();

        lista.add(f);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);

        Predicate<Factura> predicado= new Predicate<>() {
            @Override
            public boolean test(Factura f) {
                System.out.println(" iteracion ");
                return f.getImporte()>300;
            }
        };


        Factura facturaFiltro=
                lista.stream()
                        .filter(predicado).findFirst().get();
        System.out.println("UNICA :"+facturaFiltro.getImporte());


    }
}
