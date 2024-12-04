package com.proyecto.concesionaria.persistencia;

import com.proyecto.concesionaria.logica.Auto;
import java.util.List;
import java.util.logging.Logger;

public class ControladorPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();

    public void save(Auto auto) {
        autoJpa.create(auto);
    }

    public List<Auto> traerAutos() {
        return autoJpa.findEntities();
    }

    public void eliminarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        }
        
    }

    public Auto traerAutoAEdit(int idAuto) {
        return autoJpa.find(idAuto);
    }

    public void ModificarAuto(Auto auto) {
        autoJpa.edit(auto);
    }
    
}
