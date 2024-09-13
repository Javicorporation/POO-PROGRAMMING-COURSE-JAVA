package com.buscadorgenerico;

import java.util.Collection;
import java.util.Iterator;

public class Buscador <T extends Identificable, K>{
    public T buscar(Collection<? extends T>elemento, K id){

        T encontrado = null;
        Iterator<? extends T> iterator = elemento.iterator();
        while(iterator.hasNext() && encontrado == null){
            T actual = iterator.next();
            if (actual.sameId(id)){
                encontrado = actual;
            }
        }

        return encontrado;
    }
}
