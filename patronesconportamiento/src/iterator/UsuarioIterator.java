package iterator;

public interface UsuarioIterator {

    // devolver el siguiente elemento en una lista
    public Usuario next();

    // reinia el servicio
    public void reset();

    // indica si hay mas elementos
    public boolean hasMore();
}
