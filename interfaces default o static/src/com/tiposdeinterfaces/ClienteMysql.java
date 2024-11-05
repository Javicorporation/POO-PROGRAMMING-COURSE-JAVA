package com.tiposdeinterfaces;

public class ClienteMysql implements ClienteBaseDeDato{

    @Override
    public void conectar() {
        System.out.println("estas conectado a una base de datos Mysql");
    }
}
