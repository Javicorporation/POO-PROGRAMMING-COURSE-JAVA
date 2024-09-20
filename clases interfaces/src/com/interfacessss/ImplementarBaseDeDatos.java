package com.interfacessss;

public class ImplementarBaseDeDatos implements BasesDeDatos{
    @Override
    public void insertar() {
        System.out.println("Se inserto un dato");
    }

    @Override
    public void listar() {
        System.out.println("se elinsta un dato");
    }

    @Override
    public void actualizar() {
        System.out.println("Se actualiza un dato");
    }

    @Override
    public void eliminar() {
        System.out.println("se elimina un dato");
    }
}
