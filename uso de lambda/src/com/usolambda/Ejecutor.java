package com.usolambda;

public interface Ejecutor {

    void ejecutar();

    default void metodoDefecto(){}

    static void metodoEstatico(){}
}
