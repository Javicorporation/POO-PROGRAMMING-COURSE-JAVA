package com.pilas;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        // instanciassion de pila
        Stack<Integer> pila = new Stack<>();

        System.out.println("Pila vacia: "+pila);
        System.out.println("Pila vacia: "+pila.isEmpty());



        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        // asi podemos recorrer una pila y presentarla
        for(Integer i : pila) {
            System.out.println(i);
        }
        // asi presentamos la lista
        System.out.println(pila);
        System.out.println("Pila vacia: "+pila.isEmpty());
        System.out.println("Pila vacia: "+pila.peek());
        //b elimina el ultimo elemento
        System.out.println("Pila vacia: "+pila.pop());
        System.out.println(pila);
    }
}
