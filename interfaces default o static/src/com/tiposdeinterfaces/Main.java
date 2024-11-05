package com.tiposdeinterfaces;

public class Main {
    public static void main(String[] args) {
        ClienteBaseDeDato clienteBaseDeDato1 = new ClienteMysql();
        ClienteBaseDeDato clienteBaseDeDato2 = new ClientePostgreSql();

        clienteBaseDeDato1.conectar();
        clienteBaseDeDato2.conectar();

        ClienteBaseDeDato.nombreDeNegocio();

    }

}
