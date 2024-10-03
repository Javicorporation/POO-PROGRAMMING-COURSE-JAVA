package com.prueba.main;

import com.prueba.clases.Desarrollador;
import com.prueba.clases.Empleado;
import com.prueba.clases.Gerente;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Empleado> empleados = new LinkedList();
        empleados.add(new Desarrollador("Juanin", 240, 20));


        empleados.add(new Gerente("Pablita",450));


        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            empleado.calcularSalario();

        }


    }
}
