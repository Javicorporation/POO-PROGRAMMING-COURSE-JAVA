package principio;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre;
    private String apellidos;
    private int edad;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.PERSIST)
    private List<Libro> libros = new ArrayList();

    public Persona(String nombre, String apellidos, int edad, List<Libro> libros) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.libros = libros;
    }

    public Persona() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public boolean addLibro(Libro e) {
        return libros.add(e);
    }
}
