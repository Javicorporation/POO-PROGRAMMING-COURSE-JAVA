package com.mycompany.mavenproject0.logica;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    
    //relacion de uno a muchos
    @OneToMany(mappedBy = "carrera")
    private List<Materia> listaMaterias;

    public Carrera() {
    }

    public Carrera(int id, String name, List<Materia> listaMaterias) {
        this.id = id;
        this.name = name;
        this.listaMaterias = listaMaterias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
    
    
    

    

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", name=" + name + '}';
    }

    
    
    
    
    
    
}
