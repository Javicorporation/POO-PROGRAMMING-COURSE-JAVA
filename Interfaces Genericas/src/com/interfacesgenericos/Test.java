package com.interfacesgenericos;

public class Test {
    public static void main(String[] args) {

        Persona p  = new Persona(1233, "juanin", "paz");
        Auto a = new Auto("TYTYH","verde");

        identificable(a);

    }

    public static void identificable(Identificable objetoIdentificable){
        System.out.println("Yo soy "+objetoIdentificable);
    }
}
