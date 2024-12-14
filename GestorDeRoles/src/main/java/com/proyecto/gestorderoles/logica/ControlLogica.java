package com.proyecto.gestorderoles.logica;

import com.proyecto.gestorderoles.persistencia.ControlPersitencia;
import java.util.List;

public class ControlLogica {
    
    ControlPersitencia controlPersitencia;
  

    public ControlLogica() {
        this.controlPersitencia = new ControlPersitencia();
    }
    
    

    public User validarUsuario(String userName, String pass) {
        
        //boolean ok = false;
        //String mensje = "usuario o contraseña incorrecta";
        User ucer = null;
        List<User> listaUsuarios = controlPersitencia.traerUser();
        
        for(User user: listaUsuarios){
            if (user.getUserName().equals(userName) && user.getPass().equals(pass)) {
                //mensje = "Bienvenido...";
                ucer = user;
                break; 
            }
        
        }
        return ucer;
        
    }

    public List<User> traerUsers() {
       return controlPersitencia.traerUser();
    }
    
}
