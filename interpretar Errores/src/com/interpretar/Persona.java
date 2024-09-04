package com.interpretar;

public class Persona {
    private int edad;

    public Persona(int edad) {
        setEdad(edad);
    }

    private void setEdad(int edad) {
        try {
            Verificado.checkEsNegativo(edad);
            this.edad = edad;
        }catch (RuntimeException e){
            throw new RuntimeException("Error al validar el edad",e);

        }

    }
}
