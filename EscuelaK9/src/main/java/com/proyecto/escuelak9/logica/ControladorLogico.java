package com.proyecto.escuelak9.logica;

import com.proyecto.escuelak9.persistencia.ControlPersistencia;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorLogico {
    
    public ControlPersistencia controlPersistencia = new ControlPersistencia();

    public void Save(String namePet, String race, String color, 
            String allery, String special, String age, String nameowner, 
            String address, String telf) {
        
        // creamos un objeto de cada entidad pet y Owner
        Owner owner = new Owner();
        owner.setNameOwner(nameowner);
        owner.setAddress(address);
        owner.setTelf(telf);
        
        
        
        Pet pet = new Pet();
        pet.setNamePet(namePet);
        pet.setRace(race);
        pet.setColor(color);
        pet.setAllery(allery);
        pet.setSpecialTreatment(special);
        pet.setAge(age);
        // guardamos el owner en el pet
        pet.setOwner(owner);
        
        // asignamos al control de persistencia
        try {
            controlPersistencia.save(owner, pet);
            mensajeFlotante("Se Guardo correctamente", "info", "Guardado exitoso");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al guardar los datos");
            
        }
        
        
       
        
        
    }

    public void opcionSalir(JFrame jFrame) {
        // optenemos la opcion
        int opcion = 0;
        opcion = JOptionPane.showConfirmDialog(
                jFrame, "Estas seguro de salir", "Advertencia",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
    public void mensajeFlotante(String message,String tipo, String title){
        JOptionPane jOptionPane = new JOptionPane(message);
        if (tipo.equalsIgnoreCase("info")) {
            jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (tipo.equalsIgnoreCase("error")) {
            jOptionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }else if (tipo.equalsIgnoreCase("warning")) {
            jOptionPane.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
        JDialog dialog = jOptionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }

    public List<Pet> traerMascotasBD() {
        return controlPersistencia.traerMacotas();
    }

    public void borrar(int id) {
        controlPersistencia.eliminar(id);
    }

    public Pet traerPetAEdit(int idPet) {
         return  controlPersistencia.traerPetaEdit(idPet);
    }

    public void savechanges(Pet pet, String namePet, String race, String color, 
                            String allery, String special, String age, 
                            String nameOwner, String address, String telf) {
        
        pet.setNamePet(namePet);
        pet.setRace(race);
        pet.setColor(color);
        pet.setAllery(allery);
        pet.setSpecialTreatment(special);
        pet.setAge(age);
        
        controlPersistencia.modificarPet(pet);
        
        Owner owner = this.buscarOwner(pet.getOwner().getIdOwner());
        owner.setNameOwner(nameOwner);
        owner.setAddress(address);
        owner.setTelf(telf);
        
        this.modificarOwner(owner);
    }

    private Owner buscarOwner(int idOwner) {
        return controlPersistencia.buscarOwner(idOwner);
    }

    private void modificarOwner(Owner owner) {
        controlPersistencia.modificarOwner(owner);
    }

    
}
