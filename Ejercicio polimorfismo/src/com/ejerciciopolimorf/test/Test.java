package com.ejerciciopolimorf.test;

import com.ejerciciopolimorf.clase.EmpleadoComision;
import com.ejerciciopolimorf.clase.EmpleadoSalarioFijo;
import com.ejerciciopolimorf.clase.Empresa;

public class Test {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(new EmpleadoSalarioFijo("44345", "Juanin", "Carlo", 2021, 45000));
        empresa.agregarEmpleado(new EmpleadoComision("76548", "Carla", "Simone", 2021, 30000, 100, 500));
        empresa.agregarEmpleado(new EmpleadoSalarioFijo("44345", "Mario", "Caro", 2019, 50000));
        empresa.agregarEmpleado(new EmpleadoComision("76548", "Keren", "Silva", 2017, 30000, 200, 100));
        empresa.agregarEmpleado(new EmpleadoSalarioFijo("44345", "Juli", "Carrion", 2014, 10000));

    }
}
