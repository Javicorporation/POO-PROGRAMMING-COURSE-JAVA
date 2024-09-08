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
        int opcion ;
        boolean finLopp = false;

        do {
            System.out.println("\nBienvenido al comedor");
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


    public void mostrarFactura( Persona persona){
        double iva;
        double total;
        double sub = 0;
        double ivaN = 0.12;

        for (int i = 0; i < persona.combos.size(); i++) {
            sub += persona.combos.get(i).getPrecio();
        }
        iva = sub * ivaN;
        total = sub + iva;


        System.out.println("\n-- Factura --");
        System.out.println("Datos del comprador: "+ persona.nombreApellido());
        for (int i = 0; i < persona.combos.size(); i++) {
            System.out.println("* "+persona.combos.get(i).getNombreDeCombo()+" - $"+persona.combos.get(i).getPrecio());
        }
        System.out.println("Sub total: $"+ sub);
        System.out.println("Iva: $"+ iva);
        System.out.println("Total: $"+total);

    }




    public void hacerPedido() {
        int tope = combos.size() + 1;
        int opcion;
        boolean loop = false;
        Persona persona;


        String nombre;
        String apellido;
        System.out.println("\nEscriba sus datos personales..");
        System.out.print("Escriba su nombre: ");
        nombre = getting.next();
        System.out.print("Escriba su apellido: ");
        apellido = getting.next();
        persona = new Persona(nombre, apellido);
        personas.add(persona);
        do {
            System.out.println("\nEstos son los combos disponibles");
            for (int i = 0; i < combos.size(); i++) {
                System.out.println((i + 1) + ". " + combos.get(i).getNombreDeCombo()+" $"+combos.get(i).getPrecio());
            }
            System.out.println(tope + ". Salir");
            System.out.print("Escoge una opcion: ");
            opcion = getting.nextInt();
            if (opcion != tope){
                persona.combos.add(combos.get(opcion));
            }else {
                loop = true;
            }


        }while (!loop) ;
        mostrarFactura(persona);
    }

}



