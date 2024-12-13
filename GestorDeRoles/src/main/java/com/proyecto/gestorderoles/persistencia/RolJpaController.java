package com.proyecto.gestorderoles.persistencia;

import com.proyecto.gestorderoles.logica.Rol;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RolJpaController implements Serializable {
    
    //------------
    private static final Logger logger = LoggerFactory.getLogger(RolJpaController.class);
    //------------
    private EntityManagerFactory emf = null;

    
    //------------
    public RolJpaController(EntityManagerFactory emf) {
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
    public RolJpaController() {
        this.emf = Persistence.createEntityManagerFactory("gestorRoles");
    }
    
    //------------ metodo create
    public void create(Rol rol){
        if (rol == null) {
            throw new IllegalArgumentException("El objeto Owner no puede ser nulo.");
        }
        
        EntityManager em = null;
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(rol);
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
            
            Rol rol = em.find(Rol.class, id);
            if (rol == null) {
                throw new EntityNotFoundException("El Owner con el id "+id+" no existe.");
            }
            em.remove(rol);
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
    public void edit(Rol rol){
        if (rol == null) {
            throw new IllegalArgumentException("El objeto Owner no puede ser nulo.");        
        }
        EntityManager em = null;
        
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(rol);
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
    public Rol find(int id){
        EntityManager em = getEntityManager();
        try {
            return em.find(Rol.class, id);
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    //------------ metodo para obtener Owners sin parametros
    public List<Rol> findEntities(){
        return findEntities(true, -1, -1);
    }
    
    
    //------------ metodo para obtener Owners con parametros
    public List<Rol> findEntities(int maxRes, int firstRes){
        return findEntities(false, maxRes, firstRes);
    }
    
    
    //------------ metodo interno para ejecutar las consultas.
    private List<Rol> findEntities(boolean all, int maxRes, int firstRe){
        EntityManager em = null;
        em = getEntityManager();
        try {
            CriteriaQuery<Rol> cq = em.getCriteriaBuilder().createQuery(Rol.class);
            cq.select(cq.from(Rol.class));
            TypedQuery<Rol> query = em.createQuery(cq);
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
