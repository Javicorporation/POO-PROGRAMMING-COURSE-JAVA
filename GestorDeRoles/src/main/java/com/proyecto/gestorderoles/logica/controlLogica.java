package com.proyecto.gestorderoles.logica;

import com.proyecto.gestorderoles.persistencia.ControlPersitencia;
import java.util.List;

public class controlLogica {
    ControlPersitencia controlPersitencia;

    public controlLogica() {
        this.controlPersitencia = new ControlPersitencia();
    }
    
    

    public String validarUsuario(String userName, String pass) {
        
        String mensje = "usuario o contraseña incorrecta";
        List<User> listaUsuarios = controlPersitencia.traerUser();
        
        for(User user: listaUsuarios){
            if (user.getUserName().equals(userName) && user.getPass().equals(pass)) {
                mensje = "Bienvenido...";
                break; 
            }
        
        }
        return mensje;
        
    }
    
}