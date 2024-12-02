package com.proyecto.concesionaria.logica;

public class Auto {
    
    private int id;
    private String model;
    private String brand;
    private String motor;
    private String color;
    private int numDoor;

    public Auto(int id, String model, String brand, String motor, String color, int numDoor) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.motor = motor;
        this.color = color;
        this.numDoor = numDoor;
    }

    public Auto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumDoor() {
        return numDoor;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", model=" + model + ", brand=" + brand + ", motor=" + motor + ", color=" + color + ", numDoor=" + numDoor + '}';
    }
    
    
    
}
