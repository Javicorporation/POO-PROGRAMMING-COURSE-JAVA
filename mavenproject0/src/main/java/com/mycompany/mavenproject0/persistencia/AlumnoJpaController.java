package com.mycompany.mavenproject0.persistencia;

import com.mycompany.mavenproject0.logica.Alumno;
import com.mycompany.mavenproject0.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
public class AlumnoJpaController implements Serializable {
    public AlumnoJpaController(EntityManagerFactory emf){
    this.emf = emf;
    }
    
    public AlumnoJpaController(){
    emf = Persistence.createEntityManagerFactory("pruebajpaPU");
    }
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    private  EntityManagerFactory emf = null;

    void create(Alumno alumno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
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
            Alumno alumno;
            try {
                alumno = em.getReference(Alumno.class, id);
                alumno.getId();
                
            } catch (EntityNotFoundException e) {
                throw new NonexistentEntityException("El alumno con el id: "+id+" no existe", e);
            }
            em.remove(alumno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
    public void edit(Alumno alumno)throws NonexistentEntityException,Exception{
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            alumno = em.merge(alumno);
            em.getTransaction().commit();
        } catch (Exception e) {
            String msg = e.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = alumno.getId();
                if (findAlumno(id) == null) {
                    throw new NonexistentEntityException("El alumno con el id: "+id+" no existe");
                } 
            }
            throw e;
        }finally{
            if (em!= null) {
                em.close();
            }
        }
    }

    public Alumno findAlumno(int id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            return em.find(Alumno.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Alumno> findAlumnoEntities() {
       return findAlumnoEntities(true, -1, 0);
    }
    
    public List<Alumno> findAlumnoEntities(int maxresult, int minresult){
        return findAlumnoEntities(false, maxresult, minresult);
    }
    
    private List<Alumno> findAlumnoEntities(boolean all, int maxresult, int minresult){
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Alumno> cq = em.getCriteriaBuilder().createQuery(Alumno.class);
            cq.select(cq.from(Alumno.class));
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
