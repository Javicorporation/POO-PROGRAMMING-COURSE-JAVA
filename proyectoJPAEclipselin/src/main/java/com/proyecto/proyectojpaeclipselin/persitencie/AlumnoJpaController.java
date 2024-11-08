package com.proyecto.proyectojpaeclipselin.persitencie;

import com.proyecto.proyectojpaeclipselin.logica.Alumno;
import com.proyecto.proyectojpaeclipselin.persitencie.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;


public class AlumnoJpaController implements Serializable {
    
    
    // creamos una intancia de un entityManager
    private EntityManagerFactory emf = null;

    // creamos un contructor normal de la clase
    public AlumnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    // este objeto nos permite realizar las operaciones CRUD en la base de datos
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    // nos permite inicializar EntityManagerFactory de manera automatica sin necesidad de 
    // un parametro externo
    public AlumnoJpaController(){
        emf = Persistence.createEntityManagerFactory("alumnoJpa");
    }
    
    // obtener un alumno
    public Alumno findAlumno(int id){
        // implementacion de un objeto EntityManager en null
        EntityManager em = null;
        try {
            // obtenemos un EntityManager para realizar las operaciones en las base de datos
            em = getEntityManager();
            // retornamos un objeto Alumno por medio de metodo find
            // se puede hacer asi  tambien o directo en el return
            //Alumno alu = em.find(Alumno.class, id);
            return em.find(Alumno.class, id);
        }finally{
            // si el EntityManager no es nulo, libera recursos por medio del metodo .close()
            if (em != null) {
                em.close();                
            }
        }
    }
    
    
    // Este es un método privado que realiza la búsqueda general
    private List<Alumno> findAlumnosEntidad(boolean all, int maxRsl, int minRsl){
        EntityManager em = getEntityManager();
        try {
            // Crea un CriteriaQuery para realizar la consulta en la tabla de Alumno
            CriteriaQuery<Alumno> cq = em.getCriteriaBuilder().createQuery(Alumno.class);
            
            // selecciona todos los registros de la entidadalumno
            cq.select(cq.from(Alumno.class));
            
            // genera la consulta basada en el criteriaQuery
            Query q = em.createQuery(cq);
            
            // Si 'all' es falso, se limitan los resultados
            if (!all) {
                q.setMaxResults(maxRsl);
                q.setFirstResult(minRsl);             
            }
            return q.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
    // Un método público que llama a findAlumnosEntidad para obtener todos los registros.
    public List<Alumno> findAlumnosEntities(){
        // si es true no se aplicarán límites de resultados
        // y se devolverán todos los registros encontrados.
        return findAlumnosEntidad(true, -1, 0);
    }
    
    public List<Alumno> findAlumnosEntities(int maxRes, int firsRes){
        return findAlumnosEntidad(false, maxRes, firsRes);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //recomendacion implementar TryCatch en los metodos
    
    // metodo crear
    public void Create(Alumno alumno){
        // implementacion de un objeto EntityManager en null
        EntityManager em = null;
        try {
            // obtenemos un EntityManager para realizar las operaciones en las base de datos
            em = getEntityManager();
            // inicializa una transaccion en la base de datos
            em.getTransaction().begin();
            // guarda un objeto alumno en la BD
            em.persist(alumno);
            // confirma los cambios en la BD de manera permanente
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Dio Error...");
            e.getStackTrace();
            System.out.println(e.getMessage());
        }finally{
            // si el EntityManager no es nulo, libera recursos por medio del metodo .close()
            if(em != null){
                em.close();
            }
        }
    }
    
    
    
    // metodo eliminar un objeto alumno
   public void destroy (int id) throws NonexistentEntityException{
       // implementamos un objeto EntityManager en null
       EntityManager em = null;
       try {
           // obtenemos  un entityManager para las operaciones
           em = getEntityManager();
           // iniciamos la transaccion con la base de datos
           em.getTransaction().begin();
           // creamos un alumno local en el trycatch
           Alumno alumno;
           
           try {
               // busca un alumno por medio de su id con un proxy
               alumno = em.getReference(Alumno.class, em);
               // verifica si el alumno existe
               alumno.getId();
           } catch (Exception e) {
               // Lanza una excepción si el ID no existe en la base de datos
               throw new NonexistentEntityException("El id "+id+" no existe",e);
           }
           // elimina un registro Alumno de la tabla
           em.remove(alumno);
           // confirma los cambios en la BD de manera permanente
           em.getTransaction().commit();
           
           
       }finally{
           // liberamos recursos
           if (em != null){
               em.close();
           }
       }
   }
   
   
   // metodo edit
   public void edit(Alumno alumno) throws NonexistentEntityException{
       // creacion de un entityManager en null
       EntityManager em = null;
       
       try {
           // Obtiene un EntityManager para realizar la transacción en la base de datos
           em = getEntityManager();
           // inicializa una transaccion 
           em.getTransaction().begin();
           // actualiza un registro de la base de datos por medio del merge
           alumno = em.merge(alumno);
           // confirma la transaccion, haciendo los cambios permanentes en la base de datos
           em.getTransaction().commit();
       } catch (Exception e) {
           // obtiene un mensaje de error para verificar si es vacio o nulo
           String msg = e.getLocalizedMessage();
           if (msg == null || msg.length() == 0) {
               // Si no hay mensaje, verifica si el alumno existe en la base de datos
               int id = alumno.getId();
               if (findAlumno(id) == null) {
                   // lanza una exception si el alumno no existe
                   throw new NonexistentEntityException("El alumno con el id: "+id+" no existe");
               } 
           }
           // Relanza la excepción original si hay otro tipo de error
           throw e;
       }finally{
           // se liberan recursos
           if (em != null) {
               em.close(); 
           }
       }
   }
    
    
   
}
