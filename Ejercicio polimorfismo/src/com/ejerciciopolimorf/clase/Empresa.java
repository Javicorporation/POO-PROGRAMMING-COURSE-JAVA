package com.ejerciciopolimorf.clase;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> empleados;


    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void mostrarSalarios(){}

    public  void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public Empleado empleadoConMasClientes(){
        Empleado empleadoConMasCli = null;
        return empleadoConMasCli;
    }
}
