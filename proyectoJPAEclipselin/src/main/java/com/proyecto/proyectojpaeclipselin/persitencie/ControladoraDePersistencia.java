package com.proyecto.proyectojpaeclipselin.persitencie;

import com.proyecto.proyectojpaeclipselin.logica.Alumno;
import com.proyecto.proyectojpaeclipselin.logica.Carrera;
import com.proyecto.proyectojpaeclipselin.logica.Materia;
import com.proyecto.proyectojpaeclipselin.persitencie.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;


public class ControladoraDePersistencia {
    
    // instancia de JPAControler de alumno    
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
    
    
    // instancia de JPAControler de carrera
    
    
    CarreraJpaController controladorJpaCarrera = new CarreraJpaController();

    public void crearCarrera(Carrera carrera) {
        controladorJpaCarrera.createCarrera(carrera);
    }

    public void eliminarCarrera(int id) {
        controladorJpaCarrera.destroyCarrera(id);
    }

    public void editarCarrera(Carrera carrera) {
        controladorJpaCarrera.editCarrera(carrera);
    }

    public Carrera traerCarrera(int id) {
        return controladorJpaCarrera.findCarrera(id);
    }

    public List<Carrera> traerListaCarrera() {
        return controladorJpaCarrera.findAllCarreras();
    }

    
    // instancia de JPAControler de Materia
    

    public MateriaJpaController materiaJpaController = new MateriaJpaController();
    public void crearMateria(Materia materia) {
        materiaJpaController.create(materia);
    }

    public void eliminarMateria(int id) {
        materiaJpaController.destroy(id);
    }

    public void editarMateria(int id) {
        materiaJpaController.edit(id);
    }

    public Materia traerMateria(int id) {
        return materiaJpaController.findMateria(id);
    }

    public List<Materia> TraerListaMateria() {
        return materiaJpaController.findAllMaterias;
    }

    
    
    
    
    
}
