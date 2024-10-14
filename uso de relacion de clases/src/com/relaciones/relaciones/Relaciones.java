package com.relaciones.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setId(1L);
        auto1.setMarca("Chevrolet");
        auto1.setModelo("Mazda");
        List<Propietario> listapropietarios = new ArrayList<>();
        Propietario prop1 = new Propietario(1L , "Juanin", "Lopez");
        Propietario prop2 = new Propietario(2L, "Maria", "carl");

        listapropietarios.add(prop1);
        listapropietarios.add(prop2);

        auto1.setListaPropietarios(listapropietarios);
        System.out.println("El auto "+ auto1.getMarca()+" "+auto1.getModelo()+
                " tiene como propietaria a "+ auto1.getListaPropietarios().toString()+" como propietarios");
    }
}
