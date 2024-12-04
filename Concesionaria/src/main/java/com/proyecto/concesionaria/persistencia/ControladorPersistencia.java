package com.proyecto.concesionaria.persistencia;

import com.proyecto.concesionaria.logica.Auto;
import java.util.List;

public class ControladorPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();

    public void save(Auto auto) {
        autoJpa.create(auto);
    }

    public List<Auto> traerAutos() {
        return autoJpa.findEntities();
    }
    
}
