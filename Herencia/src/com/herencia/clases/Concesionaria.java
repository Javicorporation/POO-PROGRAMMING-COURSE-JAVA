package com.herencia.clases;

import com.herencia.vehiculo.Auto;
import com.herencia.vehiculo.Moto;
import com.herencia.vehiculo.Vehiculo;

import java.util.ArrayList;

public class Concesionaria {

    // Manera normal de instanciar objetos, sin uso de upcasting o generalización
    /*private ArrayList<Auto> autos;
    private ArrayList<Moto> motod;

    public Conscesionario() {
        this.autos = new ArrayList<>();
        this.motod = new ArrayList<>();
    }

    public void agregarAuto(Auto auto) {
        this.autos.add(auto);
    }
    public void agregarMoto(Moto moto) {
        this.motod.add(moto);
    }*/

    // forma de upcasting o generalizacion
    ArrayList<Vehiculo> vehiculos ;
    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        if (v instanceof Auto) {
            // casteamos el vehiculo a un auto
            Auto a =(Auto) v;
            // y ya podemos usar los metodos del auto
            a.prenderAire();

            // se puede hacer asi tambien
            //castear el auto en la misma linea
            //((Auto) v).prenderAire();
        }
        this.vehiculos.add(v);
    }
}
