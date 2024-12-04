package com.proyecto.concesionaria.persistencia;

import com.proyecto.concesionaria.logica.Auto;

public class ControladorPersistencia {
    AutoJpaController autoJpa = new AutoJpaController();

    public void save(Auto auto) {
        autoJpa.create(auto);
    }
    
}
