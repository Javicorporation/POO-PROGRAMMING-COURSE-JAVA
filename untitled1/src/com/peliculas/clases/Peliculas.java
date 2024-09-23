package com.peliculas.clases;

import java.io.Serializable;
import java.util.Objects;

public class Peliculas implements Serializable {
    // en una clase de java bean todos los atributos deben ser privados
    private String nombre;

    public Peliculas() {
    }

    public Peliculas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peliculas peliculas = (Peliculas) o;
        return Objects.equals(nombre, peliculas.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return "Peliculas: " +
                "nombre= " + nombre ;
    }
}
