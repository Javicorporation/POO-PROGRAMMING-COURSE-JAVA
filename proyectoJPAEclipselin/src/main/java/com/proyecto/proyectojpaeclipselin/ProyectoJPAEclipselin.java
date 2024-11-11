package com.proyecto.proyectojpaeclipselin;

import com.proyecto.proyectojpaeclipselin.logica.Alumno;
import com.proyecto.proyectojpaeclipselin.logica.Carrera;
import com.proyecto.proyectojpaeclipselin.logica.ControladoraLogicaAlumno;
import com.proyecto.proyectojpaeclipselin.logica.ControladoraLogicaCarrera;
import com.proyecto.proyectojpaeclipselin.persitencie.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Date;

public class ProyectoJPAEclipselin {

    public static void main(String[] args) throws NonexistentEntityException {
        
        ControladoraLogicaAlumno controladora = new ControladoraLogicaAlumno();
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
        ControladoraLogicaCarrera controlCarrera = new ControladoraLogicaCarrera();
        //Carrera carrera1 = new Carrera(1, "Quimica");
        Carrera carrera2 = new Carrera(2, "Quimica");
        Carrera carrera3 = new Carrera(3, "Fisica");
        Carrera carrera4 = new Carrera(4, "Historia");
        
//        
        controlCarrera.crearCarrera(carrera2);
        controlCarrera.crearCarrera(carrera3);
        controlCarrera.crearCarrera(carrera4);
        
//        carrera1.setNombre("Matematicas");
//        controlCarrera.editarCarrera(carrera1);
        ArrayList<Carrera> carreras = controlCarrera.traerListaCarreras();
        
        for(Carrera carrer : carreras){
            System.out.println("- "+carrer);}
    }
}
