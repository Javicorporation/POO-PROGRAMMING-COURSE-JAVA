package com.herencia2;

public class Empleado extends Persona{
    private int numeroEmpleado;
    private String cargo;
    private double salario;

    public Empleado() {}

    public Empleado(int id, int dni, String nombre, String apellido, int edad, String domicilio, String telefono, double salario, int numeroEmpleado, String cargo, double salario2) {
        super(id, dni, nombre, apellido, edad, domicilio, telefono);
        this.cargo = cargo;
        this.salario = salario;
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
