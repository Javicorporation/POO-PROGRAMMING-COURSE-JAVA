package com.mycompany.mavenproject0.persistencia;

import com.mycompany.mavenproject0.logica.Alumno;
import com.mycompany.mavenproject0.logica.Carrera;
import com.mycompany.mavenproject0.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;


public class CarreraJpaController {
    
    
    public CarreraJpaController(EntityManagerFactory emf){
    this.emf = emf;
    }
    
    public CarreraJpaController(){
    emf = Persistence.createEntityManagerFactory("pruebajpaPU");
    }
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    private  EntityManagerFactory emf = null;

    void create(Carrera carrera) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(carrera);
            em.getTransaction().commit(); 
        } catch (Exception e) {
            System.out.println("Error...");
        }finally{
            if (em != null) {
                em.close();                
            }
        }
    }

    void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carrera carrera;
            try {
                carrera = em.getReference(Carrera.class, id);
                carrera.getId();
                
            } catch (EntityNotFoundException e) {
                throw new NonexistentEntityException("La carrera con el id: "+id+" no existe", e);
            }
            em.remove(carrera);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
    public void edit(Carrera carrera)throws NonexistentEntityException,Exception{
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            carrera = em.merge(carrera);
            em.getTransaction().commit();
        } catch (Exception e) {
            String msg = e.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = carrera.getId();
                if (findCarrera(id) == null) {
                    throw new NonexistentEntityException("La carrera con el id: "+id+" no existe");
                } 
            }
            throw e;
        }finally{
            if (em!= null) {
                em.close();
            }
        }
    }

    public Carrera findCarrera(int id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            return em.find(Carrera.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Carrera> findCarreraEntities() {
       return findCarreraEntities(true, -1, 0);
    }
    
    public List<Carrera> findCarreraEntities(int maxresult, int minresult){
        return findCarreraEntities(false, maxresult, minresult);
    }
    
    private List<Carrera> findCarreraEntities(boolean all, int maxresult, int minresult){
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Carrera> cq = em.getCriteriaBuilder().createQuery(Carrera.class);
            cq.select(cq.from(Carrera.class));
            Query q = em.createQuery(cq);

            if (!all) {
                q.setMaxResults(maxresult);
                q.setFirstResult(minresult);
            }
            return q.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
