package com.constructores;

public class Deportista extends Persona{

    private String deporte;

    // constructor de herencia
    public Deportista(String nombre) {
        super(nombre);
    }

    //constructor con atributos de la clase Deportista
    public Deportista(String nombre, String deporte) {
        this(nombre);
        this.deporte = deporte;
    }


    // get y set
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
