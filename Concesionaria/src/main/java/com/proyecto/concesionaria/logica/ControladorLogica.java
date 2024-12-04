package com.proyecto.concesionaria.logica;

import com.proyecto.concesionaria.persistencia.ControladorPersistencia;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

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
    
    public void MensajeFlotante(String message, String Typo, String title){
        JOptionPane jOptionPane = new JOptionPane();
        if (Typo.equalsIgnoreCase("info")) {
            jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (Typo.equalsIgnoreCase("error")) {
            jOptionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }else if (Typo.equalsIgnoreCase("warning")) {
            jOptionPane.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
        JDialog dialog = jOptionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
    
}
