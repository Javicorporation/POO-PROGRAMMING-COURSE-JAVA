package com.proyectojpa4;

import com.proyectojpa4.config.MyPersistencieUnitinfo;
import com.proyectojpa4.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> properties = new HashMap<>();

//        properties.put("hibernate.show_sql", "true");
//        properties.put("hibernate.format_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "create");

        try(EntityManagerFactory entityManagerFactory
                    = new HibernatePersistenceProvider().createContainerEntityManagerFactory(new MyPersistencieUnitinfo(), properties);){
            EntityManager emf = entityManagerFactory.createEntityManager();

            emf.getTransaction().begin();

            Student studi = new Student();
            studi.setName("Juanin");

            emf.persist(studi);
            emf.getTransaction().commit();

        }
    }
}
