package com.genericos;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

public class Sorteador<T> {

    // atributos
    // podemos usar encapsulamiento
    ArrayList<T> elementos;
    Random randon;

    // implementar un constructor


    public Sorteador() {
        this.elementos = new ArrayList<>();
        this.randon = new Random();
    }

    // agregar elemneto
    public void add(T elemento){
        this.elementos.add(elemento);  // delegamos acción
    }

    // obtener un elemento
    public T get(){
        checkEmptynes();
        return elementos.get(rnd());
    }

    // remover un elemento
    public T remove(){
        checkEmptynes();
        return elementos.remove(rnd());
    }

    private void checkEmptynes(){
        if (isEmpty()){
            throw new NoSuchElementException("No hay mas elementos");
        }
    }

    private int rnd(){
        return randon.nextInt(elementos.size());
    }


    // retornar si esta o no
    public boolean isEmpty(){
        return elementos.isEmpty(); // delegamos acción
    }
}
