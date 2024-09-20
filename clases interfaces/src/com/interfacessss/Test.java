package com.interfacessss;

public class Test {
    public static void main(String[] args) {
        BasesDeDatos datos = new ImplementarBaseDeDatos();
        datos.actualizar();
        datos.eliminar();
        datos.insertar();
        datos.listar();
    }
}
