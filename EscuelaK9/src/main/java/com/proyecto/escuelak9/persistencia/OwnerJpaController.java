package com.proyecto.escuelak9.persistencia;

import com.proyecto.escuelak9.logica.Owner;
import java.io.Serializable;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

public class OwnerJpaController implements Serializable {
    
    //------------
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
    
    
    //------------ metodo eliminar
    public void destroy(int id){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            
            Owner owner = em.find(Owner.class, id);
            if (owner == null) {
                throw new EntityNotFoundException("El Owner con el id "+id+" no existe.");
            }
            em.remove(owner);
            em.getTransaction().commit();
        } catch (EntityNotFoundException e) {
            logger.error("Error al eliminar el Owner: {}", e.getMessage(), e);
            throw e;
        }finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    //------------ metodo actualizar
    public void edit(Owner owner){
        if (owner == null) {
            throw new IllegalArgumentException("El objeto Owner no puede ser nulo.");        
        }
        EntityManager em = null;
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(owner);
            em.getTransaction().commit();
        } catch (Exception e) {
            logger.error("Error al actualizar el Owner: {}", e.getMessage(), e);
            throw new RuntimeException("No se pudo actualizar el owner.", e);
        }finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    //------------ metodo buscar Owner por Id
    public Owner find(int id){
        EntityManager em = getEntityManager();
        try {
            return em.find(Owner.class, id);
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    //------------ metodo para obtener Owners sin parametros
    public List<Owner> findEntities(){
        return findEntities(true, -1, -1);
    }
    
    
    //------------ metodo para obtener Owners con parametros
    public List<Owner> findEntities(int maxRes, int firstRes){
        return findEntities(false, maxRes, firstRes);
    }
    
    
    //------------ metodo interno para ejecutar las consultas.
    private List<Owner> findEntities(boolean all, int maxRes, int firstRe){
        EntityManager em = null;
        em = getEntityManager();
        try {
            CriteriaQuery<Owner> cq = em.getCriteriaBuilder().createQuery(Owner.class);
            cq.select(cq.from(Owner.class));
            TypedQuery<Owner> query = em.createQuery(cq);
            if(!all){
                query.setMaxResults(maxRes);
                query.setFirstResult(firstRe);
            }
            return query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
