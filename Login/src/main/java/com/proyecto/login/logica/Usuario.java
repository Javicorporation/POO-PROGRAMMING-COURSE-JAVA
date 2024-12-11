package com.proyecto.login.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String userName;
    private String pass;
    @OneToOne
    private Rol unRol;

    public Usuario(int id, String userName, String pass, Rol unRol) {
        this.id = id;
        this.userName = userName;
        this.pass = pass;
        this.unRol = unRol;
    }

    

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", userName=" + userName + ", pass=" + pass + ", unRol=" + unRol + '}';
    }

    
    
    
    
}
