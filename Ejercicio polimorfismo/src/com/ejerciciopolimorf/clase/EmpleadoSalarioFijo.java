package com.ejerciciopolimorf.clase;

public class EmpleadoSalarioFijo extends Empleado{

    private static final double PORCT1 = 0.05;
    private static final double PORCT2 = 0.1;
    private double suedoBasico;

    public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, int anioIngreso, double suedoBasico) {
        super(DNI, nombre, apellido, anioIngreso);
        this.suedoBasico = suedoBasico;
    }

    private double porceAdicional(){
        return suedoBasico;
    }

    @Override
    public double getSalario() {
        return 0;
    }
}
