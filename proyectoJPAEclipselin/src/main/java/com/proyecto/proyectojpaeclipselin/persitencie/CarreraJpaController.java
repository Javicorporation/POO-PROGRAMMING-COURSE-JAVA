
package com.proyecto.proyectojpaeclipselin.persitencie;

import com.proyecto.proyectojpaeclipselin.logica.Carrera;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

public class CarreraJpaController implements Serializable {
    
    // creamos una variable privada EntityManagerFactory
    private EntityManagerFactory emf= null;

    // constructor normal
    public CarreraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    // creamos un metodo que nos permita realizar las operaciones en la base de datos
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    public CarreraJpaController(){
        emf = Persistence.createEntityManagerFactory("pruebaJpa");
    }
    
    
    

    void createCarrera(Carrera carrera) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(carrera);
            em.getTransaction().commit();
        }catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        
    }

    void destroyCarrera(int id) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carrera carrera = null;
            try {
                carrera = em.getReference(Carrera.class, em);
                carrera.getId();
            } catch (Exception e) {
                System.out.println("El id "+id+" no existe");
            }
            
            em.remove(carrera);
            em.getTransaction().commit();
        } finally {
            if(em != null){
                em.close();
            }
        }
    }

    void editCarrera(Carrera carrera) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            carrera = em.merge(carrera); 
            em.getTransaction().commit();
            
        } catch (Exception e) {
            String msg = e.getLocalizedMessage();
//            if(msg == null || msg.length()== 0){
//                int id = carrera.getId();
//                
//            }
        }finally{
            if (em != null) {
                em.close();
            }
        }
    }

    public Carrera findCarrera(int id) {
        EntityManager em = null;
        try {
           em = getEntityManager();
           return em.find(Carrera.class, id);
        } finally{
            if( em != null){
                em.close();
            }
        }
    }

    
    public List<Carrera> findAllCarreras() {
        return findAllCarrera(true, -1,0);
    }

    
    // se tiene que crear este metodo antes de crear el metodo traer todo
    private List<Carrera> findAllCarrera(boolean all, int maxRest, int firstRest) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Carrera> cq = em.getCriteriaBuilder().createQuery(Carrera.class);
            cq.select(cq.from(Carrera.class));
            Query q = em.createQuery(cq);
            
            if (!all) {
                q.setMaxResults(maxRest);
                q.setFirstResult(firstRest);
            }
            return q.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
    
}
