package conectar;

import java.sql.*;

public class TestConexion {
    public static void main(String[] args) throws SQLException {
        ingresarRegistro("Ramen", 5.20F, "es un Ramen");
        ingresarRegistro("Fideo", 0.25F, "es un Fideo");
        ingresarRegistro("Queso", 0.50F, "es un Queso");
        ingresarRegistro("Pan", 1.40F, "es un Pan");
        ingresarRegistro("Maiz", 0.75F, "es un Maiz");

//        elimimarRegistro(6);
        System.out.println();
        mostrarRegistros();

    }

    public static void ingresarRegistro(String nombre, float precio, String descripcion)throws SQLException {
        Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendadb","root","12345");
        String sql = "insert into producto(nombre, precio, descripcion) values(?,?,?)";
        PreparedStatement ps = conectar.prepareStatement(sql);

        ps.setString(1, nombre);
        ps.setFloat(2, precio);
        ps.setString(3, descripcion);
        ps.executeUpdate();

        ps.close();
        conectar.close();
    }

    public static void mostrarRegistros()throws SQLException {
        Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendadb","root","12345");
        String sql = "select * from producto";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            String nombre = rs.getString("nombre");
            float precio = rs.getFloat("precio");
            String descripcion = rs.getString("descripcion");
            System.out.printf("%s %f %s \n", nombre, precio, descripcion);
        }
        rs.close();
        ps.close();
        conectar.close();
    }

    public static void elimimarRegistro(int id) throws SQLException {
        Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendadb","root","12345");
        String sql = "delete from producto  where id = ?";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("articulo eliminado: ");
        System.out.printf(ps.toString());

        ps.close();
        conectar.close();
    }


}
