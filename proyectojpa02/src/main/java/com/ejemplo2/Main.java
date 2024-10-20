package com.ejemplo2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");

        EntityManager em = null;
        em = entityManagerFactory.createEntityManager();

        em.getTransaction().begin();

        Student student = new Student();

        student.setId(4);
        student.setName("Juanin");

        em.persist(student);

        em.getTransaction().commit();

    }
}
