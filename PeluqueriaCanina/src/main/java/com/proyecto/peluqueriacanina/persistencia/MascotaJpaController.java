package com.proyecto.peluqueriacanina.persistencia;

import com.proyecto.peluqueriacanina.logica.Mascota;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

public class MascotaJpaController implements Serializable {
    
    private EntityManagerFactory emf = null;

    public MascotaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    public MascotaJpaController(){
        emf = Persistence.createEntityManagerFactory("PUpeluqueriacanina");
    }
    
    // crear
    public void create(Mascota mascota){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(mascota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void destroy(int id){
        EntityManager em = getEntityManager();
        try {
            Mascota mascota = em.getReference(Mascota.class, id);
            if (mascota != null) {
                em.getTransaction().begin();
                em.remove(mascota);
                em.getTransaction().commit();
            }else{
                throw new IllegalArgumentException("Existe un error...");
            }
        } finally {
            em.close();
        }
    }
    
    public void edit(Mascota mascota){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            mascota = em.merge(mascota);
            em.getTransaction().commit();
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Mascota find(int id){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            return em.find(Mascota.class, id);
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<Mascota> findEntities(){
        return findEntitys(true, -1, 0);
    }
    
    
    private List<Mascota> findEntitys(boolean all, int maxresult, int minresult){
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Mascota> cq = em.getCriteriaBuilder().createQuery(Mascota.class);
            cq.select(cq.from(Mascota.class));
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
