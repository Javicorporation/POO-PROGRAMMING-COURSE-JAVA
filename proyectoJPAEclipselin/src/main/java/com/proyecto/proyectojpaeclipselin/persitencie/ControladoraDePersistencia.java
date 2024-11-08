package com.proyecto.proyectojpaeclipselin.persitencie;

import com.proyecto.proyectojpaeclipselin.logica.Alumno;
import com.proyecto.proyectojpaeclipselin.persitencie.exceptions.NonexistentEntityException;


public class ControladoraDePersistencia {
    
    AlumnoJpaController ContoladorAlumno = new AlumnoJpaController();

    public void crearAlumno(Alumno alumno) {
        ContoladorAlumno.Create(alumno);
    }

    public void eliminar(int id) throws NonexistentEntityException {
        ContoladorAlumno.destroy(id);   
    }

    public void editar(Alumno alumno) throws NonexistentEntityException {
        ContoladorAlumno.edit(alumno);  
        
    }
    
    
    
}
