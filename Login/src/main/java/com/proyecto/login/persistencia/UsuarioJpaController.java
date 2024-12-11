package com.proyecto.login.persistencia;

import com.proyecto.login.logica.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsuarioJpaController {
    
    //------------
    private static final Logger logger = (Logger) LoggerFactory.getLogger(UsuarioJpaController.class);
    
    //------------
    private EntityManagerFactory emf = null;
    
    //------------
    public UsuarioJpaController(EntityManagerFactory emf) {
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
    public UsuarioJpaController(){
        this.emf = Persistence.createEntityManagerFactory("bdlogin");
    }
    
    //------------ metodo create
    public void create(Usuario usuario){
        if(usuario == null){
            throw new IllegalArgumentException("El objeto Pet no puede ser nulo");
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(usuario);
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
            Usuario usuario = em.find(Usuario.class, id);
            if (usuario == null) {
                throw new EntityNotFoundException("El pet con id "+id+" no existe");
            }
            em.remove(usuario);
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
    public void edit(Usuario usuario){
        if (usuario == null) {
            throw new IllegalArgumentException("El objeto Pet no puede ser nulo.");        
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(usuario);
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
    public Usuario find(int id){
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally{
            if (em != null) {
                em.close();
            }
        }
    }
    //------------ metodo para obtener Owners sin parametros
    public List<Usuario> findEntities(){
        return findEntities(true, -1, -1);
    }
    
    
    //------------ metodo para obtener Owners con parametros
    public List<Usuario> findEntities(int maxRes, int firstRes){
        return findEntities(false,maxRes, firstRes);
    }
    
    //------------ metodo interno para ejecutar las consultas.
    private List<Usuario> findEntities(boolean all, int maxRes, int firstRe){
        EntityManager em = null;
        em = getEntityManager();
        try {
            CriteriaQuery<Usuario> cq = em.getCriteriaBuilder().createQuery(Usuario.class);
            cq.select(cq.from(Usuario.class));
            TypedQuery<Usuario> query = em.createQuery(cq);
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
