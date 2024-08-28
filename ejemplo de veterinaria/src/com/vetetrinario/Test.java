package com.vetetrinario;

public class Test {
    public static void main(String[] args) {

        veterinaria veterina = new veterinaria();
        veterina.agregarmascota(new Gato());
        veterina.agregarmascota(new Perro());

        veterina.saludarACliente();
    }
}
