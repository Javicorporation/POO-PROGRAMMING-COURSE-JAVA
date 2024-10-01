package com.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    // implementacion de excepcion
    public static void main(String[] args) throws SQLException {
        // creamos una variavle para realizar conexiòn de base de datos
        Connection conectarsql = DriverManager.getConnection("jdbc:mysql://localhost/tiendadb?serverTimezone=UTC","root", "12345");
        System.out.println("conectado");
    }
}
