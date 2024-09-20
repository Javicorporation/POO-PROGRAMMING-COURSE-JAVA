package com.envolventes;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;

    static{
        System.out.println("ejecucion de bloque estatico");
        ++Persona.contadorPersona;
        //this.idPersona=10;
    }

    {
        System.out.println("ejecutacion de bloque no codigo");
        this.idPersona = Persona.contadorPersona++;
    }

    public Persona() {
        System.out.println("Ejecucion de bloque constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }
}
