package strategy;

import java.util.ArrayList;

public class Principal0002{
    public static void main(String[] args) {

        UserMemory usuarios = new UserMemory();
//        userMemory.crear("Maria");
//        userMemory.crear("Matha");
//        userMemory.crear("Maite");
//        userMemory.crear("Mirian");


        //UserFolder userFolder = new UserFolder();

        crear(usuarios,"Maria");
        crear(usuarios,"Matha");
        crear(usuarios,"Maite");
        crear(usuarios,"Mirian");

        for (String usuario : listar(usuarios)) {
            System.out.println(usuario);
        }
    }






    public static void crear(User usuarios, String nombre){
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(User users){
        return users.listar();

    }
}
