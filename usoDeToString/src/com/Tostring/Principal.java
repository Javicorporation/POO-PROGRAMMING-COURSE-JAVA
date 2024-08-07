package com.Tostring;

public class Principal {

    public static void main(String[] args) {
        Persona persona1 = new Persona("juanin","lopez",29, true);
        Persona persona2 = new Persona("mati","luz",29, true);
        Persona persona3 = new Persona("lulu","lopez",29, true);

        System.out.println( persona1);
        System.out.println( persona2);
        System.out.println( persona3);
    }
}
