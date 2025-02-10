package strategy;

import java.util.ArrayList;

public class UserMemory implements User {

    private ArrayList<String> usuarios = new ArrayList<>();


    public void crear (String nombre) {
        usuarios.add(nombre);
    }

    public ArrayList<String> listar() {
        return usuarios;
    }
}
