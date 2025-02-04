package iterator;

public class Principal01 {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("Juana", "Paz", 20));
        usuarios.crear(new Usuario("Maria", "Luz", 20));
        usuarios.crear(new Usuario("Luz", "Gome", 20));

        while(usuarios.hasMore()){
            Usuario usuario = usuarios.next();
            System.out.println("El usuario es: " + usuario.getNombre());
        }

        usuarios.crear(new Usuario("Jazz", "Paz", 20));
    }
}
