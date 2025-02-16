package Seccion13;

import java.util.ArrayList;

public class Usuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void anadirUsuario(Usuario usuario) throws UserException {

        if (usuarios.contains(usuario)) {
            throw new UserException(usuario.nombre);
        }
        usuarios.add(usuario);


    }

}
