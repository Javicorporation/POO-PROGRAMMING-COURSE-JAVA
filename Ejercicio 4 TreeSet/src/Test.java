import com.clases.Libro;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Libro> listaLibros = new TreeSet<>();

        listaLibros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", 96));
        listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 471));
        listaLibros.add(new Libro("Don Quijote", "Miguel de Cervantes", 1072));

        // libros ordenados por titulos
        System.out.println("Libro ordenados por titulo");
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }

        Comparator<Libro> comparPorPagina = new Comparator<Libro>() {
            @Override
            public int compare (Libro libro1, Libro libro2){
                return Integer.compare(libro1.getNumeroDePaginas(), libro2.getNumeroDePaginas());
            }
        };

        TreeSet<Libro> listaDeLibrosPorPagina = new TreeSet<>(comparPorPagina);
        listaDeLibrosPorPagina.addAll(listaLibros);

        System.out.println();
        System.out.println("\nLibros ordenados por número de páginas:");
        for (Libro libro : listaDeLibrosPorPagina) {
            System.out.println(libro);
        }


    }
}
