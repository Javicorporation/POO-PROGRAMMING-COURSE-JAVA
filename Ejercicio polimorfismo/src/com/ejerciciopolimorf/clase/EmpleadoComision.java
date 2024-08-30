package com.ejerciciopolimorf.clase;

public class EmpleadoComision extends Empleado{

    private double salarioMin;
    private int cantidadDeClientesCaptados;
    private double montoPorCliente;

    public EmpleadoComision(String DNI, String nombre, String apellido, int anioIngreso, double salarioMin, int cantidadDeClientesCaptados, double montoPorCliente) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMin = salarioMin;
        this.cantidadDeClientesCaptados = cantidadDeClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public int getCantidadDeClientesCaptados() {
        return cantidadDeClientesCaptados;
    }

    @Override
    public double getSalario() {
        double sal = montoPorCliente * cantidadDeClientesCaptados;
        if (sal < salarioMin) {
            sal = salarioMin;
        }
        return sal;
    }
}
