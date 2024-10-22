import com.proyecto03.config.MyPersistenceInfo;
import com.proyecto03.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> properties = new HashMap<>();

        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "create");

        try(EntityManagerFactory entityManagerFactory
                    = new HibernatePersistenceProvider().createContainerEntityManagerFactory(new MyPersistenceInfo(), properties);){
            EntityManager emg = entityManagerFactory.createEntityManager();

            emg.getTransaction().begin();

            Student estudiante = new Student();
            estudiante.setId(1);
            estudiante.setNombre("Juanita");
            emg.persist(estudiante);

            emg.getTransaction().commit();
        }

    }
}
