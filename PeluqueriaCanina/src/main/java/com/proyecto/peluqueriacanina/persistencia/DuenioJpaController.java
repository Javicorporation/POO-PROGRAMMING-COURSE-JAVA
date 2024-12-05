package com.proyecto.peluqueriacanina.persistencia;

import com.proyecto.peluqueriacanina.logica.Duenio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;


public class DuenioJpaController implements Serializable {
    
    private EntityManagerFactory emf = null;

    public DuenioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public EntityManager  getEntityManager(){
        return emf.createEntityManager();
    }

    public DuenioJpaController() {
        emf = Persistence.createEntityManagerFactory("PUpeluqueriacanina");
    }
    
    // crear
    public void create(Duenio duenio){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(duenio);
            em.getTransaction().commit();
            
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void destroy(int id){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenio duenio = null;
            try {
                duenio = em.getReference(Duenio.class, id);
                duenio.getId();
            } catch (Exception e) {
                System.out.println("Existe un error...");
            }
            em.remove(duenio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void edit(Duenio duenio){
        EntityManager em =getEntityManager();
        try {
            //em = getEntityManager();
            em.getTransaction().begin();
            duenio = em.merge(duenio);
            em.getTransaction().commit();
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Duenio find(int id){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            return em.find(Duenio.class, id);
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<Duenio> findEntities(){
        return findEntitys(true, -1, 0);
    }
    
    
    private List<Duenio> findEntitys(boolean all, int maxresult, int minresult){
        EntityManager em = null;
        try {
            CriteriaQuery<Duenio> cq = em.getCriteriaBuilder().createQuery(Duenio.class);
            cq.select(cq.from(Duenio.class));
            Query q = em.createQuery(cq);

            if (!all) {
                q.setMaxResults(maxresult);
                q.setFirstResult(minresult);
            }
            return q.getResultList();
            
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    
    
    
    
}
