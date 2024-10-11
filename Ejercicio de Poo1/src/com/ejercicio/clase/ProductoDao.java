package com.ejercicio.clase;

import com.ejercicio.conexion.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductoDao {

    public void agregarProducto(Producto producto) {
        String sql = "INSERT INTO Producto (Nombre, Descripcion, Precio) VALUES (?,?,?)";
        try(Connection conect = ConexionBD.getConnection();
        PreparedStatement ps = conect.prepareStatement(sql)) {
            ps.setInt(1, producto.getId());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getDescripcion());
            ps.setDouble(4, producto.getPrecio());
            ps.executeUpdate();
        }catch (SQLException E){
            E.printStackTrace();
            System.out.println("Error al agregar el producto");
        }
    }
}
