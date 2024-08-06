package com.fluidInterfacesYStringBuilder;

public class Principal {
    public static void main(String[] args) {


        StringBuilder cadena = new StringBuilder("?Hola");
        System.out.println("Mensaje: "+cadena);

        cadena.delete(0,1).append(" Que tal?").insert(5," amigo ");

        System.out.println("Mensaje: "+cadena);
    }
}
