package com.prueba.clases;

public class Desarrollador extends Empleado{

    private int horasExtras;

    public Desarrollador(String nombre, double salario, int horasExtras) {
        super(nombre, salario);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        horasExtras = (int) (horasExtras * 0.12);
        return  getSalario() + horasExtras;
    }

    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.println("Rol: Desarrollador");
        System.out.println("Bonificación por proyectos: " + horasExtras);
        System.out.println("Salario total: " + calcularSalario());
    }
}
