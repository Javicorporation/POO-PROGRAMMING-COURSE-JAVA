package com.proyecto.proyectojpaeclipselin;

import com.proyecto.proyectojpaeclipselin.logica.Alumno;
import com.proyecto.proyectojpaeclipselin.logica.ControladoraLogica;
import com.proyecto.proyectojpaeclipselin.persitencie.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Date;

public class ProyectoJPAEclipselin {

    public static void main(String[] args) throws NonexistentEntityException {
        
        ControladoraLogica controladora = new ControladoraLogica();
        Alumno alumno1 = new Alumno(2, "Maria", "Caseres", new Date());
        
        //---
        //alumno1.setApellido("Quijije");
        
        //controladora.editar(alumno1);
        
        //controladora.crearAlumno(alumno1);
        //Alumno alu = controladora.traerAlumno(2);
        //System.out.println(alu);
        
        ArrayList<Alumno> alumnosss = controladora.traerAlumnos();
        for(Alumno alumnos : alumnosss){
            System.out.println(alumnos);
        }
    }
}
