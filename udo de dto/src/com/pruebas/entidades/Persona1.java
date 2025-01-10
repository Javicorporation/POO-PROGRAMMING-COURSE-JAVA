package com.pruebas.entidades;

import java.util.ArrayList;
import java.util.List;

public class Persona1 {

    private String nombre;
    private String apellidos;
    private int edad;

    public List<Deporte> getDeporte(){
        return deportes;
    }

    public void setDeportes(List<Deporte> deportes) {
        this.deportes = deportes;
    }
    private List<Deporte> deportes= new ArrayList<Deporte>();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona1(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void addDeporte(Deporte deporte) {
        this.deportes.add(deporte);
    }
}
