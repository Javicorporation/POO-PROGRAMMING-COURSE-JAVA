package com.comparable;

public class Persona implements Comparable<Persona>{

    private int id;
    private String nombre;
    private String apellido;
    private double altura;

    public Persona(int id, String nombre, String apellido, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Persona p) {

        // se compara por medio del id
        //return this.id - p.id;
        // se compara por medio del apellido
        //return this.apellido.compareTo(p.apellido);
        // se compara por la estatura
        int retorno = 0;
        if (this.altura < p.getAltura()) {
            retorno = -1;
        } else if (this.altura == p.getAltura()) {
            retorno = 1;
        }
        return retorno;
    }
}
