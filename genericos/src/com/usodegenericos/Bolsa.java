package com.usodegenericos;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T>{
    private ArrayList<T> lista = new ArrayList<>();
    private int tope;

//    public Bolsa(int tope) {
//        this.tope = tope;
//    }

    public void add(T obj){
        if(lista.size() >=tope){
            lista.add(obj);
        }else {
            throw new RuntimeException("no caben mas");
        }
    }

    @Override
    public Iterator <T>iterator() {
        return lista.iterator();
    }
}
