package com.ejerciciopolimorf.clase;

import java.time.LocalDate;

public abstract class Empleado {
    private String DNI;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public String mostrarNombres(){
        return nombre+" "+apellido;
    }
    public int aniosDeAntiguedad(){
        int anioAct = LocalDate.now().getYear();
        return anioAct - this.anioIngreso;
    }

    public abstract double getSalario();

//    @Override
//    public String toString() {
//        return "Empleado{" +
//                "DNI='" + DNI + '\'' +
//                ", nombre='" + nombre + '\'' +
//                ", apellido='" + apellido + '\'' +
//                ", anioIngreso=" + anioIngreso +
//                '}';
//    }
}