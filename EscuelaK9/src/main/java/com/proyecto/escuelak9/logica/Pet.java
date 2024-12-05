
package com.proyecto.escuelak9.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String namePet;
    private String race;
    private String color;
    private String allery;
    private String specialTreatment;
    private String age;
    @OneToOne
    private Owner owner; 

    public Pet(int id, String namePet, String race, String color, String allery, String specialTreatment, String age, Owner owner) {
        this.id = id;
        this.namePet = namePet;
        this.race = race;
        this.color = color;
        this.allery = allery;
        this.specialTreatment = specialTreatment;
        this.age = age;
        this.owner = owner;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    


    public Pet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllery() {
        return allery;
    }

    public void setAllery(String allery) {
        this.allery = allery;
    }

    public String getSpecialTreatment() {
        return specialTreatment;
    }

    public void setSpecialTreatment(String specialTreatment) {
        this.specialTreatment = specialTreatment;
    }

    

    

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    
    
    

    
    
    
    
}
