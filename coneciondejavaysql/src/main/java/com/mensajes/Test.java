package com.mensajes;

import java.sql.*;

public class Test {
    // implementacion de excepcion
    public static void main(String[] args) throws SQLException {

        listarRegistros();
        ingresarRegistros("Maria","La 8", "Guayaquil");
        System.out.println();
        listarRegistros();
    }


    public static void ingresarRegistros(String nombre, String direccion, String ciudad) throws SQLException {
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost/tiendadb?serverTimezone=UTC", "root", "12345");

        String sql = "INSERT INTO mensajes(nombre , direccion, ciudad) VALUES (?,?,?)";
        PreparedStatement ps = conectado.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setString(2, direccion);
        ps.setString(3, ciudad);
        ps.executeUpdate();


        // cerrar servicio
        ps.close();
        conectado.close();
    }







    public static void listarRegistros() throws SQLException {
        // creamos una variavle para realizar conexiòn de base de datos
        Connection conectarsql = DriverManager.getConnection("jdbc:mysql://localhost/tiendadb?serverTimezone=UTC","root", "12345");
        System.out.println("conectado");


        // variable de sentencia
        String sql = "SELECT * FROM mensajes";
        // variable de implementación de la conexión
        PreparedStatement pst = conectarsql.prepareStatement(sql);
        // resultado de la query
        ResultSet rs = pst.executeQuery();


        // recorremos  la query
        while(rs.next()){
            //implenetaacion de los datos
            String nombre = rs.getString("nombre");
            String direccion = rs.getString("direccion");
            String ciudad = rs.getString("ciudad");
            System.out.printf("%s %s %s \n", nombre, direccion, ciudad);
        }

        // cerrar servicios
        rs.close();
        pst.close();
        conectarsql.close();
    }


}
