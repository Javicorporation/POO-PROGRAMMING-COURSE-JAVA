package com.proyecto.proyectojpaeclipselin.persitencie;

import com.proyecto.proyectojpaeclipselin.logica.Alumno;
import com.proyecto.proyectojpaeclipselin.persitencie.exceptions.NonexistentEntityException;
import java.util.List;


public class ControladoraDePersistencia {
    
    AlumnoJpaController contoladorAlumno = new AlumnoJpaController();

    public void crearAlumno(Alumno alumno) {
        contoladorAlumno.Create(alumno);
    }

    public void eliminar(int id) throws NonexistentEntityException {
        contoladorAlumno.destroy(id);   
    }

    public void editar(Alumno alumno) throws NonexistentEntityException {
        contoladorAlumno.edit(alumno);  
        
    }

    public Alumno traerAlumno(int id) {
        return contoladorAlumno.findAlumno(id);
    }
    
    
    public List<Alumno> traerListaAlumnos(){
        return contoladorAlumno.findAlumnosEntities();
    }
    
    
    
}
