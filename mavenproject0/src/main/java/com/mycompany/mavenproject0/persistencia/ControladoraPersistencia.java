package com.mycompany.mavenproject0.persistencia;

import com.mycompany.mavenproject0.logica.Alumno;
import com.mycompany.mavenproject0.logica.Carrera;
import com.mycompany.mavenproject0.logica.Materia;
import java.util.ArrayList;
import java.util.List;

public class ControladoraPersistencia {
    AlumnoJpaController alumJpa = new AlumnoJpaController();
    
    // controladora de persistencia de alumno
    public void crearAlumno(Alumno alumno) {
        alumJpa.create(alumno);
    }

    public void eliminarAlumn(int id) {
        try {
            alumJpa.destroy(id);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            alumJpa.edit(alu);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public Alumno traerAlumno(int id) {
        return alumJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> listaAlumn = alumJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumno = new ArrayList<>(listaAlumn);
        return  listaAlumno;
    }
    
    
    // controladora de persistencia de carrera
    CarreraJpaController carreraJpa = new CarreraJpaController();

    public void crearCarrera(Carrera carrera) {
        carreraJpa.create(carrera);
    }

    public void eliminaCarrera(int id) {
        try {
            carreraJpa.destroy(id);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void editarCarrera(Carrera carrera) {
        try {
            carreraJpa.edit(carrera);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public Carrera traerCarrera(int id) {
        return carreraJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> carreras = carreraJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarrera = new ArrayList<>(carreras);
        return listaCarrera;
    }
    
    
    
    
    // controladora de persistencia de materia
    public MateriaJpaController materiaJpa = new MateriaJpaController();
    
    public void crearMateria(Materia materia){
        materiaJpa.create(materia);
    }
    
    public void editMateria(Materia materia){
        try {
            materiaJpa.edit(materia);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
    
    public void eliminarMateria(int id){
        try {
            materiaJpa.destroy(id);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
    
    public Materia findMateria(int id){
        return materiaJpa.findMateria(id);
    }
    
    public List<Materia> listaDeMateria(){
        List<Materia> materiass = materiaJpa.findMateriaEntities();
        ArrayList<Materia> listaDeMateri = new ArrayList<>(materiass);
        return listaDeMateri;
    }
}
