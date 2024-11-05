package com.hilos;

public class Main {
    public static void main(String[] args) {
        HiloHijo hiloHijo = new HiloHijo();
        hiloHijo.start();


        EjecutableEjemplo ejemplo = new EjecutableEjemplo();
        Thread threadEjemplo = new Thread(ejemplo);
        threadEjemplo.start();
    }
}
