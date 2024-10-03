package com.prueba.clases;

public class Gerente extends Empleado{

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void calcularSalario() {
        this.setSalario(this.getSalario() + (this.getSalario() * 0.05));
    }
}
