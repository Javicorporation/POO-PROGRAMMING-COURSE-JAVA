package com.ejercicio;



public class Persona implements Comparable<Persona>{

    @Override
    public int compareTo(Persona p) {
        if (p.getId() > this.getId()) {
            return -1;
        } else if (p.getId() < this.getId()) {
            return 1;
        }return 0;
    }

    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return
                " \n"+
                "\nid=" + id +
                " \nnombre='" + nombre +
                " \nedad=" + edad ;
    }
}


