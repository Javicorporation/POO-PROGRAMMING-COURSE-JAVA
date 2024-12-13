package com.proyecto.gestorderoles.persistencia;

import com.proyecto.gestorderoles.logica.User;
import java.util.List;

public class ControlPersitencia {
    UserJpaController userJpa;

    public ControlPersitencia() {
        this.userJpa = new UserJpaController();
    }
    

    public List<User> traerUser() {
        return userJpa.findEntities();
    }
    
}
