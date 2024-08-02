package com.sobrecargaDeMetodos;

public class Robot {
    private String nombre;

    public Robot(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void saludar(String nombrePersona) {
        System.out.println("hola "+nombrePersona+ ", soy "+nombre);
    }

    public void saludar() {
        saludar("extraño");
    }
}
