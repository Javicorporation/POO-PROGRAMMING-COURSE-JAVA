package com.proyecto.escuelak9.persistencia;

import com.proyecto.escuelak9.logica.Owner;
import com.proyecto.escuelak9.logica.Pet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetJpaController {
    
    //------------
    private static final Logger logger = LoggerFactory.getLogger(PetJpaController.class);
    
    //------------
    private EntityManagerFactory emf = null;
    
    //------------
    public PetJpaController(EntityManagerFactory emf) {
        if (emf == null) {
            throw new IllegalArgumentException("El EntityManagerFactory no puede ser nulo");
        }
        this.emf = emf;
    }
    
    //------------
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    //------------
    public PetJpaController(){
        this.emf = Persistence.createEntityManagerFactory("EscuelaK9");
    }
    
    //------------ metodo create
    public void create(Pet pet){
        if(pet == null){
            throw new IllegalArgumentException("El objeto Pet no puede ser nulo");
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pet);
            em.getTransaction().commit();
        } catch (Exception e) {
            logger.error("Error al crear el objeto Pet", e.getCause(), e);
            throw new RuntimeException("no se puede crear Pet", e);
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
            Pet pet = em.find(Pet.class, id);
            if (pet == null) {
                throw new EntityNotFoundException("El pet con id "+id+" no existe");
            }
            em.remove(pet);
            em.getTransaction().commit();
        } catch (EntityNotFoundException e) {
            logger.error("Error al eliminar el pet: {}", e.getMessage(), e);
            throw e;
        }finally{
            if (em != null) {
                em.close();
            }
        }
    }
    //------------ metodo actualizar
    public void edit(Pet pet){
        if (pet == null) {
            throw new IllegalArgumentException("El objeto Pet no puede ser nulo.");        
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(pet);
            em.getTransaction().commit();
        } catch (Exception e) {
            logger.error("Error al actualizar el Pet: {}", e.getMessage(), e);
            throw new RuntimeException("No se pudo actualizar el Pet.", e);
        }finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    //------------ metodo buscar Owner por Id
    public Pet find(int id){
        EntityManager em = getEntityManager();
        try {
            return em.find(Pet.class, id);
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    //------------ metodo para obtener Owners sin parametros
    public List<Pet> findEntities(){
        return findEntities(true, -1, -1);
    }
    
    
    //------------ metodo para obtener Owners con parametros
    public List<Pet> findEntities(int maxRes, int firstRes){
        return findEntities(false,maxRes, firstRes);
    }
    
    //------------ metodo interno para ejecutar las consultas.
    private List<Pet> findEntities(boolean all, int maxRes, int firstRe){
        EntityManager em = null;
        em = getEntityManager();
        try {
            CriteriaQuery<Pet> cq = em.getCriteriaBuilder().createQuery(Pet.class);
            cq.select(cq.from(Pet.class));
            TypedQuery<Pet> query = em.createQuery(cq);
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
