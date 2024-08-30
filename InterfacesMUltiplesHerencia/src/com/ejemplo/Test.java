package com.ejemplo;

public class Test {
    public static void main(String[] args) {
        Persona persona = new Persona("2664");
        Reserva reserva = new Reserva();
        Automovil automovil = new Automovil();
        persona.mostrarIdentificacion();
        reserva.mostrarIdentificacion();
        automovil.mostrarIdentificacion();
    }
}
