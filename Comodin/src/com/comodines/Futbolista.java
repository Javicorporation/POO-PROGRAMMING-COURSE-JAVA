package com.comodines;

public class Futbolista extends Deportista{

    private int nroCamisa;

    public Futbolista(String nombre, String apellido, int energia, int nroCamisa) {
        super(nombre, apellido, energia);
        this.nroCamisa = nroCamisa;
    }

    public void patear(){
        System.out.println("pateando...");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nroCamisa=" + nroCamisa +
                '}';
    }
}
