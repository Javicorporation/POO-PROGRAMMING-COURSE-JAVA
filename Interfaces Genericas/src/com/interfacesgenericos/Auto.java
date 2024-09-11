package com.interfacesgenericos;

public class Auto implements Identificable<String>{
    private String patente;
    private String color;

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public String getId() {
        return this.patente;
    }

    @Override
    public void setId(String id) {
        this.patente = id;
    }
}
