package com.comparacionoequals;

public class Principal {
    public static void main(String[] args) {

        // comparacion normal co "==" co variables
//        int a = 8;
//        int b = 5;
//        int c = 8;
//
//        System.out.println(a == b);
//        System.out.println(a == c);


        // comparacion con objetos

        Persona p1 = new Persona("juanin");
        Persona p2 = new Persona("juanin");
        //esta variable p3 apunta aun objeto ya creado
        Persona p3 = p1;

        System.out.println(p1 == p2);// false - por que se comparan 2 variables con instancias de memoria distintos
        System.out.println(p1.equals(p2));// true - por que se comparan 2 variables con instancias de memoria iguales

        // con la implementacion de método equals y hashCode en la clase persona
        // se podria usar el metodo equals correctamente
        // si los datos del objeto son iguales tendran el mismo identificador de objetos
        System.out.println(p1);
        System.out.println(p2);

    }

}