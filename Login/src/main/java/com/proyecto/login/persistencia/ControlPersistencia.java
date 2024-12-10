package com.proyecto.login.persistencia;

import com.proyecto.login.logica.Usuario;
import java.util.List;

public class ControlPersistencia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return usuarioJpa.findEntities();
    }
    
}
