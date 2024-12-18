package com.proyectojpa4;

import com.proyectojpa4.config.MyPersistencieUnitinfo;
import com.proyectojpa4.entities.City;
import com.proyectojpa4.entities.Student;
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
                    = new HibernatePersistenceProvider().createContainerEntityManagerFactory(new MyPersistencieUnitinfo(), properties);){
            EntityManager emf = entityManagerFactory.createEntityManager();

            emf.getTransaction().begin();

//            // perist cascada
            City city = new City();
            city.setName("California");

            //Student studi = emf.getReference(Student.class, 1);
//            studi.setName("Juanin");
//            studi.setCity(city);

            // insertar estudiante
            //emf.persist(studi);

            //------------


            Student student2 = new Student();
            student2.setName("Jack");
            student2.setCity(city);
            emf.persist(student2);


            emf.getTransaction().commit();

        }
    }
}
