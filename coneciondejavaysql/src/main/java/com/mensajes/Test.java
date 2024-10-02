package com.mensajes;

import java.sql.*;

public class Test {
    // implementacion de excepcion
    public static void main(String[] args) throws SQLException {

        ingresarRegistros("Mariana", "Bastion", "Guayaquil");
        listarRegistros();
        System.out.println();
        editarRegistro("Maria", "Bastion", "Guayaquil");
        System.out.println();
        eliminarRegistro("Maria");
        listarRegistros();
    }

    private static Connection conectador() throws SQLException {
        Connection conectador = DriverManager.getConnection("jdbc:mysql://localhost/tiendadb?serverTimezone=UTC", "root", "12345");
        return conectador;
    }


    // insertar un registro desde java
    public static void ingresarRegistros(String nombre, String direccion, String ciudad) throws SQLException {
        Connection conectado = conectador();

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


    // mostrar los registros desde java
    public static void listarRegistros() throws SQLException {
        // creamos una variavle para realizar conexiòn de base de datos
        Connection conectado = conectador();
        System.out.println("conectado");


        // variable de sentencia
        String sql = "SELECT * FROM mensajes";
        // variable de implementación de la conexión
        PreparedStatement pst = conectado.prepareStatement(sql);
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
        conectado.close();
    }




    public static void editarRegistro(String direccion, String ciudad, String nombre) throws SQLException {
        Connection conectar = conectador();
        System.out.println("Conexion exitosa");
        String sql = "UPDATE mensajes SET direccion = ?, ciudad = ? WHERE nombre = ?";
        PreparedStatement pst = conectar.prepareStatement(sql);

        pst.setString(1, direccion);
        pst.setString(2, ciudad);
        pst.setString(3, nombre);
        // sirve para actualizar la tabla
        pst.executeUpdate();

        pst.close();
        conectar.close();
    }

    public static void eliminarRegistro(String nombre) throws SQLException{
        Connection conectar = conectador();
        String sql = "DELETE FROM mensajes WHERE nombre = ?";
        PreparedStatement pst = conectar.prepareStatement(sql);
        pst.setString(1, nombre);
        pst.executeUpdate();
        pst.close();
        conectar.close();

    }

}
