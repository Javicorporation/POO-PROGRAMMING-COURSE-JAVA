package com.herencia2;

public class Jefe extends Persona{
    private int idJefe;
    private String departamento;

    public Jefe(int id, int dni, String nombre, String apellido, int edad, String domicilio, String telefono, int idJefe, String departamento) {
        super(id, dni, nombre, apellido, edad, domicilio, telefono);
        this.idJefe = idJefe;
        this.departamento = departamento;
    }
    public Jefe(){}

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
