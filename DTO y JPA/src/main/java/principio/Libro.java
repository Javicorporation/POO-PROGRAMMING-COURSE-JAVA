package principio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Libro {

    @Id
    private String titulo;
    private int paginas;
    @ManyToOne
    @JoinColumn(name="persona_nombre")
    private Persona persona;


    public Libro(String titulo, int paginas, Persona persona) {
        super();
        this.titulo = titulo;
        this.paginas = paginas;
        this.persona = persona;
    }

    public Libro() {
        super();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
