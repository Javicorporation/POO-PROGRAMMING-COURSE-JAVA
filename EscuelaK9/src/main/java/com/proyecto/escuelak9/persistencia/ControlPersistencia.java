package com.proyecto.escuelak9.persistencia;

import com.proyecto.escuelak9.logica.Owner;
import com.proyecto.escuelak9.logica.Pet;
import javax.persistence.EntityManagerFactory;

public class ControlPersistencia {
    
    public OwnerJpaController ownerJpa = new OwnerJpaController();
    public PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        ownerJpa.create(owner);
        petJpa.create(pet);
    }
    
    
    
    
    
}
