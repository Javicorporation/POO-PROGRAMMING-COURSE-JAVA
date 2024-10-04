package com.herencia2;

public class Consultor  extends Persona{
    private String nombreConsultora;
    private int numeroConsultor;

    public Consultor() {}


    public Consultor(int id, int dni, String nombre, String apellido, int edad, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, edad, domicilio, telefono);
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumeroConsultor() {
        return numeroConsultor;
    }

    public void setNumeroConsultor(int numeroConsultor) {
        this.numeroConsultor = numeroConsultor;
    }
}
