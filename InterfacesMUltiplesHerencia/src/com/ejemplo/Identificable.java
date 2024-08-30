package com.ejemplo;

public interface Identificable {
    public default void mostrarIdentificacion(){
        System.out.println(hashCode());
    }
}
