package com.mycompany.mavenproject0;
import com.mycompany.mavenproject0.logica.Alumno;
import com.mycompany.mavenproject0.logica.Controladora;
import com.mycompany.mavenproject0.persistencia.ControladoraPersistencia;
import java.util.Date;


public class Mavenproject0 {
    public static void main(String[] args) {
        
        Controladora controladora = new Controladora();
        
        Alumno alumno1 = new Alumno(10, "Carlitos", "Paz", new Date());
        controladora.crearAlumno(alumno1);
        
        //controladora.eliminarAlumno(1);
        
        alumno1.setApellido("Marss");
        controladora.editarAlumno(alumno1);
    }
}
