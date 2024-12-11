package com.proyecto.login.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int idRol;
    private String nombreRol;
    private String descripcion;

    public Rol(int idRol, String nombreRol, String descripcion) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
    }

    public Rol() {
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
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
        return "Rol{" + "idRol=" + idRol + ", nombreRol=" + nombreRol + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
