package com.proyecto.proyectojpaeclipselin.logica;

// esta clase va a implementar los metodos

import com.proyecto.proyectojpaeclipselin.persitencie.ControladoraDePersistencia;
import com.proyecto.proyectojpaeclipselin.persitencie.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;

public class ControladoraLogicaAlumno {
    
    ControladoraDePersistencia controlDePersistencia = new ControladoraDePersistencia();
    
    
    public void crearAlumno(Alumno alumno) {
        controlDePersistencia.crearAlumno(alumno);
    }
    
    public void eliminar(int id) throws NonexistentEntityException{
        controlDePersistencia.eliminar(id);
    }
    
    public void editar(Alumno alumno) throws NonexistentEntityException{
        controlDePersistencia.editar(alumno);
    }
    
    public Alumno traerAlumno(int id){
        return controlDePersistencia.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerAlumnos(){
        // cremos una lista por medio del metodo
        List<Alumno> listaDeAlumnos = controlDePersistencia.traerListaAlumnos();
        // casteamos la lista en un arrayList
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(listaDeAlumnos);
        return  listaAlumnos;
    }
}
