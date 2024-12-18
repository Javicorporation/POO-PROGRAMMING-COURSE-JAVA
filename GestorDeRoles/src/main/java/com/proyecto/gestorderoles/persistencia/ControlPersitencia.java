package com.proyecto.gestorderoles.persistencia;

import com.proyecto.gestorderoles.logica.Rol;
import com.proyecto.gestorderoles.logica.User;
import java.util.List;

public class ControlPersitencia {
    UserJpaController userJpa;
    RolJpaController rolJpa;

    public ControlPersitencia() {
        this.userJpa = new UserJpaController();
        this.rolJpa = new RolJpaController();
    }
    

    public List<User> traerUsers() {
        return userJpa.findEntities();
    }

    public List<Rol> obtenerRol() {
        return rolJpa.findEntities();
    }

    public List<Rol> traerRoles() {
        return rolJpa.findEntities();
    }

    public void crearUsuario(User user) {
        userJpa.create(user);
    }

    public void borrarUser(int id) {
        try {
            userJpa.destroy(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public User traerUser(int id) {
        return userJpa.find(id);
    }

    public void editarUser(User user) {
        try {
            userJpa.edit(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
