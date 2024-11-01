package com.usovar;

public class Test {
    public static void main(String[] args) {
        // se puede inplementar como constante
        final var a = "hola";
        var b = 1;

        var usuario = new User();

        // no se puede intanciar una variable como null
        //var c = null;

        var d = palabra();


    }

    public static String palabra(){
        return "hola";
    }
}