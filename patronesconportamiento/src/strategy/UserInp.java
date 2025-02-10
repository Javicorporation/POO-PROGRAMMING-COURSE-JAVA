package strategy;

import java.util.ArrayList;

public class UserInp implements User{

    public ArrayList<String> usuarios = new ArrayList<>();


    @Override
    public void crear(String nombre) {

        usuarios.add(nombre);
    }

    @Override
    public ArrayList<String> listar() {
        return usuarios;
    }
}
