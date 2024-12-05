
package com.proyecto.escuelak9.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idOwner;
    private String nameOwner;
    private String address;
    private String telf;

    public Owner(int idOwner, String nameOwner, String address, String telf) {
        this.idOwner = idOwner;
        this.nameOwner = nameOwner;
        this.address = address;
        this.telf = telf;
    }

    public Owner() {
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    @Override
    public String toString() {
        return "Owner{" + "idOwner=" + idOwner + ", nameOwner=" + nameOwner + ", address=" + address + ", telf=" + telf + '}';
    }
    
    
    
}
