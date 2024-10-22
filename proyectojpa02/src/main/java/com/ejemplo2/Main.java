package com.ejemplo2;

import com.ejemplo2.config.MyPersistenUnitInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> properties = new HashMap<>();
        try(EntityManagerFactory emf
                    = new HibernatePersistenceProvider().createContainerEntityManagerFactory(new MyPersistenUnitInfo(), properties)) {


        EntityManager em  = emf.createEntityManager();

        em.getTransaction().begin();

        Student student = new Student();

        student.setId(8);
        student.setName("Pablito");

        em.persist(student);

        em.getTransaction().commit();
        }

    }
}
