package com.proyecto.gestorderoles.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String UserName;
    private String pass;
    @OneToOne
    private Rol rol;

    public User(int id, String UserName, String pass, Rol rol) {
        this.id = id;
        this.UserName = UserName;
        this.pass = pass;
        this.rol = rol;
    }


    public User() {
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", UserName=" + UserName + ", pass=" + pass + ", rol=" + rol + '}';
    }

  
    
    
    
}
