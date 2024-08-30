package com.ejerciciopolimorf.clase;

import java.time.LocalDate;
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

    public void mostrarEmpleados(){
        for (Empleado emp : empleados){
            System.out.println(emp.mostrarNombres() + ": $"+emp.getSalario());
        }
    }


    public Empleado empleadoConMasClientes(){
        Empleado empleadoConMasCli = null;
        int max = -1;

        for (Empleado e : empleados){
            if (e instanceof EmpleadoComision) {
                EmpleadoComision eplCo = (EmpleadoComision) e;
                int cant = eplCo.getCantidadDeClientesCaptados();
                if (cant > max) {
                    max = cant;
                    empleadoConMasCli = eplCo;
                }
            }
        }
        return empleadoConMasCli;
    }


}
