package com.prueba.clases;

public class Gerente extends Empleado{

    private double bonificacionGerente;

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
        this.bonificacionGerente = 0;
    }

    @Override
    public double calcularSalario() {
         return this.getSalario() + bonificacionGerente;
    }

    @Override
    public void mostrardatos(){
        super.mostrardatos();
        System.out.println("Rol: Gerente");
        System.out.println("Bonificación Gerente: " + bonificacionGerente);
        System.out.println("Salario total: " + calcularSalario());
    }
}
