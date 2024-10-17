package com.usodegenericos;

public class Test {
    public static void main(String[] args) {

        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("dentro de la caja");
        String contenid = cajaString.obtenerValor();
        System.out.println("---------- "+contenid);

        Caja<Integer> cajaInts = new Caja<>();
        cajaInts.ponerAlgo(23);
        Integer numero = cajaInts.obtenerValor();
        System.out.println("---------- "+numero);

    }
}
