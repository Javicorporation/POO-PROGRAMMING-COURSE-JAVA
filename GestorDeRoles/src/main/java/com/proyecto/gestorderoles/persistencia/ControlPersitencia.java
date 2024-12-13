package com.proyecto.gestorderoles.persistencia;

import com.proyecto.gestorderoles.logica.User;
import java.util.List;

public class ControlPersitencia {
    UserJpaController userJpa;
    RolJpaController rolJpa;

    public ControlPersitencia() {
        this.userJpa = new UserJpaController();
        this.rolJpa = new RolJpaController();
    }
    

    public List<User> traerUser() {
        return userJpa.findEntities();
    }
    
}
