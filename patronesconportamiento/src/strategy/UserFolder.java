package strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UserFolder {

    private String ficheroUser = "usuarios.txt";
    private PrintStream fichero;

    public UserFolder() {
        try {
            fichero = new PrintStream(ficheroUser);
        }catch (Exception e){
            System.out.println("No puedo abrirlo"+e.getMessage());
        }
    }


    public void crear(String nombre) {
        fichero.println(nombre);
    }

    public ArrayList<String> listar(){
        ArrayList<String> usuarios = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(ficheroUser));
            while(scanner.hasNext()){
                usuarios.add(scanner.next());
            }
        }catch (Exception e){
            System.out.println("Error al leer el fichero"+e.getMessage());
        }
        return usuarios;
    }
}
