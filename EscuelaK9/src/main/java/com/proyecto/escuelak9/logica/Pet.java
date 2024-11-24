
package com.proyecto.escuelak9.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String namePet;
    private String race;
    private String color;
    private boolean allery;
    private boolean specialTreatment;
    private int age;
    private Owner owner; 

    public Pet(int id, String namePet, String race, String color, boolean allery, boolean specialTreatment, int age, Owner owner) {
        this.id = id;
        this.namePet = namePet;
        this.race = race;
        this.color = color;
        this.allery = allery;
        this.specialTreatment = specialTreatment;
        this.age = age;
        this.owner = owner;
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

    public boolean isAllery() {
        return allery;
    }

    public void setAllery(boolean allery) {
        this.allery = allery;
    }

    public boolean isSpecialTreatment() {
        return specialTreatment;
    }

    public void setSpecialTreatment(boolean specialTreatment) {
        this.specialTreatment = specialTreatment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", namePet=" + namePet + ", race=" + race + ", color=" + color + ", allery=" + allery + ", specialTreatment=" + specialTreatment + ", age=" + age + ", owner=" + owner + '}';
    }
    
    
    
}
