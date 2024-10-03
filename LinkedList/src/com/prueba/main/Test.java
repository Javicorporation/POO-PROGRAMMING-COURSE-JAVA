package com.prueba.main;

import com.prueba.clases.Desarrollador;
import com.prueba.clases.Empleado;
import com.prueba.clases.Gerente;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Empleado> empleados = new LinkedList();
//        empleados.add(new Desarrollador("Juanin", 240, 20));
//
//
//        empleados.add(new Gerente("Pablita",450));

        Gerente gerente1 = new Gerente("Juan Pérez", 3000.0);
        Desarrollador desarrollador1 = new Desarrollador("María García", 2000.0, 30);
        Desarrollador desarrollador2 = new Desarrollador("Carlos López", 2200.0, 10);
        Gerente gerente2 = new Gerente("Ana Torres", 3500.0);

        empleados.add(gerente1);
        empleados.add(desarrollador1);
        empleados.add(desarrollador2);
        empleados.add(gerente2);


        for (Empleado empleado : empleados) {
            empleado.mostrardatos();
            System.out.println("-------------------------------");
        }


    }
}
