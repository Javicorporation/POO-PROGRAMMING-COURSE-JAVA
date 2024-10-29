package com.mycompany.mavenproject0.persistencia;

import com.mycompany.mavenproject0.logica.Alumno;
import java.util.ArrayList;
import java.util.List;

public class ControladoraPersistencia {
    AlumnoJpaController alumJpa = new AlumnoJpaController();

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
}
