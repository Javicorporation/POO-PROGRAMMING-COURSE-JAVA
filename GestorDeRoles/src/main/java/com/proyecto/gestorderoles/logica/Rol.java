package com.proyecto.gestorderoles.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreRol;
    private String descripcion;
    @OneToMany(mappedBy = "rol")
    private List<User> listaDeUser;

    public Rol(int id, String nombreRol, String descripcion, List<User> listaDeUser) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.listaDeUser = listaDeUser;
    }

    public List<User> getListaDeUser() {
        return listaDeUser;
    }

    public void setListaDeUser(List<User> listaDeUser) {
        this.listaDeUser = listaDeUser;
    }

    

    public Rol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", nombreRol=" + nombreRol + ", descripcion=" + descripcion + ", listaDeUser=" + listaDeUser + '}';
    }

    
    
    
    
}
