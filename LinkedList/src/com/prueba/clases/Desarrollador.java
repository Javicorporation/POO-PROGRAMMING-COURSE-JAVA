package com.prueba.clases;

public class Desarrollador extends Empleado{

    private int horasExtras;

    public Desarrollador(String nombre, double salario, int horasExtras) {
        super(nombre, salario);
        this.horasExtras = horasExtras;
    }

    @Override
    public void calcularSalario() {
        horasExtras = (int) (horasExtras * 0.12);
        setSalario(getSalario() + horasExtras);
    }
}
