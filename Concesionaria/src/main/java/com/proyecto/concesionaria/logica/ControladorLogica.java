package com.proyecto.concesionaria.logica;

import com.proyecto.concesionaria.persistencia.ControladorPersistencia;

public class ControladorLogica {
    public ControladorPersistencia controladorPersistencia = new ControladorPersistencia();

    public void saveEntity(String Model, String Brand, String Motor, String Color, String NumDoor) {
        
        Auto auto = new Auto();
        
        auto.setModel(Model);
        auto.setBrand(Brand);
        auto.setMotor(Motor);
        auto.setColor(Color);
        auto.setNumDoor(Integer.parseInt(NumDoor));
        
        try {
            controladorPersistencia.save(auto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error no se pudo Guardar");
        }
    }
    
}
