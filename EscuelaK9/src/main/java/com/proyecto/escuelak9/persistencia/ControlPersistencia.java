package com.proyecto.escuelak9.persistencia;

import com.proyecto.escuelak9.logica.Owner;
import com.proyecto.escuelak9.logica.Pet;
import com.proyecto.escuelak9.persistencia.exceptions.NonexistentEntityException;
import java.lang.System.Logger.Level;
import java.util.List;
import java.util.logging.Logger;

public class ControlPersistencia {
    
    public OwnerJpaController ownerJpa = new OwnerJpaController();
    public PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        ownerJpa.create(owner);
        petJpa.create(pet);
    }

    public List<Pet> traerMacotas() {
        return petJpa.findEntities();
    }

    public void eliminar(int id) {
        try {
            petJpa.destroy(id);
        } catch (NullPointerException ex) {
            Logger.getLogger(ControlPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        }
        
    }

    public Pet traerPetaEdit(int idPet) {
        return petJpa.find(idPet);
    }

    public Owner buscarOwner(int idOwner) {
        return ownerJpa.find(idOwner);
    }

    public void modificarPet(Pet pet) {
        petJpa.edit(pet);
    }

    public void modificarOwner(Owner owner) {
        ownerJpa.edit(owner);
    }
    
    
    
    
    
}
