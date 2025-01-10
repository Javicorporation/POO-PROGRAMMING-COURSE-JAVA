package principio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersonas");
        EntityManager em = emf.createEntityManager();
        List<Persona> lista=em.createQuery("select p from Persona p", Persona.class).getResultList();

        for (Persona p:lista) {

            System.out.println(p.getApellidos());
            for(Libro l :p.getLibros()) {

                System.out.println(l.getTitulo());
                System.out.println(l.getPaginas());

            }
        }
    }
}
