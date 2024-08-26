package com.tostring;

public class Test {
    public static void main(String[] args) {

        Persona p1 = new Persona("Juanin","Lopez", 12, false);
        Persona p2 = new Persona("Pamela","Lopez", 19, false);
        Persona p3 = new Persona("Maria","Lopez", 25, true);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
