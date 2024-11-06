package com.proyecto.proyectojpaeclipselin.persitencie;

import com.proyecto.proyectojpaeclipselin.logica.Alumno;
import com.proyecto.proyectojpaeclipselin.persitencie.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;


public class AlumnoJpaController implements Serializable {
    
    
    // creamos una intancia de un entityManager
    private EntityManagerFactory emf = null;

    // creamos un contructor normal de la clase
    public AlumnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    // este objeto nos permite realizar las operaciones CRUD en la base de datos
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    // nos permite inicializar EntityManagerFactory de manera automatica sin necesidad de 
    // un parametro externo
    public AlumnoJpaController(){
        emf = Persistence.createEntityManagerFactory("alumnoJpa");
    }
    
    
   
}
