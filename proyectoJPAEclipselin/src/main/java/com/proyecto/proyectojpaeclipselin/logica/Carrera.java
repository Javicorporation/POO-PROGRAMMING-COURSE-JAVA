package com.proyecto.proyectojpaeclipselin.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    @OneToMany
    private LinkedList<Materia> listamaterias;

    public Carrera(int id, String nombre, LinkedList<Materia> listamaterias) {
        this.id = id;
        this.nombre = nombre;
        this.listamaterias = listamaterias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getListamaterias() {
        return listamaterias;
    }

    public void setListamaterias(LinkedList<Materia> listamaterias) {
        this.listamaterias = listamaterias;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombre=" + nombre + ", listamaterias=" + listamaterias + '}';
    }
    
    

    
    
    
    
}
