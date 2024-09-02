package com.ejercicio;

import java.util.ArrayList;

public class UnidadEducativa {
    private ArrayList<Alumno> alumnos;

    public int cantidadAprobados(){
        int cantidad = 0;
        for (Alumno a : alumnos) {
            a.aprobable();
            cantidad++;
        }
        return cantidad;
    }

    public UnidadEducativa() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno a){
        alumnos.add(a);
    }
}
