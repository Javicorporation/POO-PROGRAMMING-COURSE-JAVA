package iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {

    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int posiscion = 0;

    public void crear(Usuario usuario) {
        usuarios.add(usuario);
    }


    @Override
    public Usuario next() {
        Usuario usuario = usuarios.get(posiscion);
        posiscion++;
        return usuario;
    }

    @Override
    public void reset() {
        posiscion = 0;
    }

    @Override
    public boolean hasMore() {
        return posiscion < usuarios.size();
    }
}
