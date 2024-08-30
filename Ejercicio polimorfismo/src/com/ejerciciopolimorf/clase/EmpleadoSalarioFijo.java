package com.ejerciciopolimorf.clase;

public class EmpleadoSalarioFijo extends Empleado{

    private static final double PORCT1 = 0.05;
    private static final double PORCT2 = 0.1;
    private static final double MAX_A = 5;
    private static final double MIN_A = 2;
    private double suedoBasico;

    public EmpleadoSalarioFijo(String DNI, String nombre, String apellido, int anioIngreso, double suedoBasico) {
        super(DNI, nombre, apellido, anioIngreso);
        this.suedoBasico = suedoBasico;
    }

    private double porceAdicional(){
        int ant = aniosDeAntiguedad();
        double porcentaje = 0.0;
        if (ant > MAX_A) {
            porcentaje = PORCT2;
        } else if (ant >= MIN_A) {
            porcentaje = PORCT1;
        }
        return porcentaje;
    }

    @Override
    public double getSalario() {
        return suedoBasico + suedoBasico * porceAdicional();
    }
}
