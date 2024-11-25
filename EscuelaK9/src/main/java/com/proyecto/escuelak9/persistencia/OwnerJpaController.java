package com.proyecto.escuelak9.persistencia;

import com.proyecto.escuelak9.logica.Owner;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OwnerJpaController implements Serializable {
    
    private static final Logger logger = LoggerFactory.getLogger(OwnerJpaController.class);
    //------------
    private EntityManagerFactory emf = null;

    
    //------------
    public OwnerJpaController(EntityManagerFactory emf) {
        if(emf == null){
            throw new IllegalArgumentException("El EntityManagerFactory no puede ser nulo.");
        }
        this.emf = emf;
    }
    
    //------------
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    //------------
    public OwnerJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EscuelaK9");
    }
    
    //------------ metodo create
    public void create(Owner owner){
        if (owner == null) {
            throw new IllegalArgumentException("El objeto Owner no puede ser nulo.");
        }
        
        EntityManager em = null;
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(owner);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            logger.error("Error al crear el Owner", e.getMessage(), e);
            throw new RuntimeException("no se pudo crear el Owner", e);
        }finally{
            if (em != null) {
                em.close();
            }
        }   
    }
    
    
    
    
    
    
}
