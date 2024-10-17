package com.javasql;

import com.sun.jdi.connect.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String url = "jdbc:mysql://localhost:3306/basededatos";
    private static final String user = "root";
    private static final String password = "12345";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user,password);
    }

}
