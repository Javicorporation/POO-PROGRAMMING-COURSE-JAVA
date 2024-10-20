package com.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        // proporciona un contexto
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");

        EntityManager em = null;

        // es el objeto que gestiona la interacción con la base de datos.
        // Se utiliza para realizar operaciones CRUD (crear, leer, actualizar, eliminar) en las entidades.
        em = entityManagerFactory.createEntityManager();


        //Inicia una transacción en la base de datos. Las transacciones permiten agrupar una o más operaciones en una sola unidad de trabajo.
        // Si algo sale mal, se puede deshacer la transacción.
        em.getTransaction().begin();


        Student student = new Student();
        student.setId(1);
        student.setName("John Doe");

        // El método persist hace que la entidad Student sea gestionada por el contexto de persistencia.
        // Esto significa que se registrará en la base de datos cuando se confirme la transacción.
        em.persist(student);

        // Confirma la transacción.
        // Todas las operaciones realizadas dentro de la transacción se hacen efectivas en la base de datos.
        em.getTransaction().commit();
    }
}
