package com.comodines;

public class Deportista extends Persona{
    private int energia;

    public Deportista( String nombre, String apellido,int energia) {
        super(nombre, apellido);
        this.energia = energia;
    }

    public void descansar(){
        this.energia = 100;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "energia=" + energia +
                '}';
    }
}
