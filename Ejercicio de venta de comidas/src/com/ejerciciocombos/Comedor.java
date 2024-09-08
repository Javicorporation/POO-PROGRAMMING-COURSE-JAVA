package com.ejerciciocombos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comedor {
    public Scanner getting = new Scanner(System.in);
    private List<ComboDeComida> combos;
    private List<Persona> personas;


    public Comedor() {
        this.combos = new ArrayList<>();
        this.personas = new ArrayList<>();

    }

    public void  agregarComida(ComboDeComida comida){
        this.combos.add(comida);
    }



    public void menu(){
        int opcion = 0;
        boolean finLopp = false;

        do {
            System.out.println("\nbienvenido al comedor");
            System.out.println("1. Elegir Comida");
            System.out.println("2. Mostrar registro de ventas");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = getting.nextInt();
            switch(opcion){
                case 1:
                    hacerPedido();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.print("adios");
                    finLopp = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (!finLopp);

    }
//    public void guardarPersona(){
//        String nombre, apellido;
//        System.out.print("Escriba su nombre: ");
//        nombre = getting.next();
//        System.out.print("Escriba su apellido: ");
//        apellido = getting.next();
//        personas.add(new Persona(nombre, apellido));
//    }

    public void mostrarFactura( Persona persona){
        double iva = 0;
        double sub = 0;
        double ivaN = 0.12;
        double total = 0;

        for (int i = 0; i < persona.combos.size(); i++) {
            sub += persona.combos.get(i).getPrecio();
        }
        iva = sub * ivaN;
        total = sub + iva;


        System.out.println("-- Factura --");
        System.out.println("Datos del comprador: "+ persona.nombreApellido());
        for (int i = 0; i < persona.combos.size(); i++) {
            System.out.println(persona.combos.get(i).getNombreDeCombo()+" - $"+persona.combos.get(i).getPrecio());
        }
        System.out.println("Sub total: $"+ sub);
        System.out.println("Iva: $"+ iva);
        System.out.println("Total: $"+total);

    }




    public void hacerPedido() {
        int tope = combos.size() + 1;
        int opcion = 0;
        boolean loop = false;
        Persona persona = null;//

        //guardarPersona();
        String nombre, apellido;
        System.out.print("Escriba su nombre: ");
        nombre = getting.next();
        System.out.print("Escriba su apellido: ");
        apellido = getting.next();
        persona = new Persona(nombre, apellido);
        personas.add(persona);
        do {
            System.out.println("Estos son los combos");
            for (int i = 0; i < combos.size(); i++) {
                System.out.println((i + 1) + ". " + combos.get(i).getNombreDeCombo());
            }
            System.out.println(tope + ". Salir");
            System.out.print("Escoge una opcion: ");
            opcion = getting.nextInt();
            if (opcion != tope){
                persona.combos.add(combos.get(opcion));
                mostrarFactura(persona);
            }else {
                loop = true;
            }

        }while (!loop) ;
    }

    public void escogerComida(){}

}



