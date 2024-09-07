package com.ejerciciocombos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comedor {
    public Scanner getting = new Scanner(System.in);
    private List<ComboDeComida> combos;
    private List<Persona> usuarios;

    public Comedor() {
        this.combos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void  agregarComida(ComboDeComida comida){
        this.combos.add(comida);
    }


    public void menu(){
        int opcion = 0;
        boolean finLopp = false;
        //Persona persona = null;//
        do {
            System.out.println("bienvenido al comedor");
            System.out.println("1. Elegir Comida");
            System.out.println("2. Mostrar registro de ventas");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = getting.nextInt();
            switch(opcion){
                case 1:
                    menuDeCombos();
                case 2:
                    System.out.println();
                case 3:
                    System.out.print("adios");
                    finLopp = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (!finLopp);

    }
    public void guardarPersona(){
        String nombre, apellido;
        System.out.print("Escriba su nombre: ");
        nombre = getting.next();
        System.out.print("Escriba su apellido: ");
        apellido = getting.next();
        usuarios.add(new Persona(nombre, apellido));
    }

    public void mostrarFactura(int numCombo){

        double iva = combos.get(numCombo).getPrecio() * 0.12;
        double total = combos.get(numCombo).getPrecio() + iva;
        System.out.println("-- Factura --");
        System.out.println("Datos del comprador: "+ usuarios.get(numCombo).nombreApellido());

        System.out.println("Producto: "+combos.get(numCombo).getNombreDeCombo());
        System.out.println("Precio: "+combos.get(numCombo).getPrecio());

        System.out.println("Iva: "+ iva);
        System.out.println("Total: "+total);

    }




    public void menuDeCombos() {
        guardarPersona();
        int tope = combos.size() + 1;
        int opcion = 0;
        boolean loop = false;
        do {
            System.out.println("Estos son los combos");
            for (int i = 0; i < combos.size(); i++) {
                System.out.println((i + 1) + ". " + combos.get(i).getNombreDeCombo());
            }
            System.out.println(tope + ". Salir");
            System.out.print("Escoge una opcion: ");
            opcion = getting.nextInt();
            if(opcion != tope){
                mostrarFactura(opcion-1);
                loop = true;
            }
        }while (!loop) ;
    }

}



