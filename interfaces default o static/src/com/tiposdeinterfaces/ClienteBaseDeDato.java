package com.tiposdeinterfaces;

public interface ClienteBaseDeDato {

    default void conectar(){
        System.out.println("Conectando con una base de datos");
    }

    static void nombreDeNegocio(){
        System.out.println("Nombre de negocio en ejecucion");
    }
}
