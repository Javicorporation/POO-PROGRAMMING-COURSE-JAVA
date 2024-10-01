package com.mensajes;

import java.sql.*;

public class Test {
    // implementacion de excepcion
    public static void main(String[] args) throws SQLException {
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
