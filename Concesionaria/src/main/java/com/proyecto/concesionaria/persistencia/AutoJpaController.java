package com.proyecto.concesionaria.persistencia;

import com.proyecto.concesionaria.logica.Auto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

public class AutoJpaController implements Serializable {
    private EntityManagerFactory emf = null;

    public AutoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public EntityManager  getEntityManager(){
        return emf.createEntityManager();
    }

    public AutoJpaController() {
        emf = Persistence.createEntityManagerFactory("PUpeluqueriacanina");
    }
    
    // crear
    public void create(Auto auto){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(auto);
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
            Auto auto = null;
            try {
                auto = em.getReference(Auto.class, id);
                auto.getId();
            } catch (Exception e) {
                System.out.println("Existe un error...");
            }
            em.remove(auto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void edit(Auto auto){
        EntityManager em =getEntityManager();
        try {
            //em = getEntityManager();
            em.getTransaction().begin();
            auto = em.merge(auto);
            em.getTransaction().commit();
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Auto find(int id){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            return em.find(Auto.class, id);
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<Auto> findEntities(){
        return findEntitys(true, -1, 0);
    }
    
    
    private List<Auto> findEntitys(boolean all, int maxresult, int minresult){
        EntityManager em = null;
        try {
            CriteriaQuery<Auto> cq = em.getCriteriaBuilder().createQuery(Auto.class);
            cq.select(cq.from(Auto.class));
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
