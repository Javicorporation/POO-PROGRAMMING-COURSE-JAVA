package com.proyecto.login.logica;

import com.proyecto.login.persistencia.ControlPersistencia;
import java.util.List;

public class ControlLogica {
    
    ControlPersistencia controlPersistencia;

    public ControlLogica() {
        this.controlPersistencia = new ControlPersistencia();
    }
    
    

    public Usuario validarUsuario(String pass, String usuario) {
        
        //String mensaje = "";
        // variable boolean
        //boolean ok = false;
        Usuario usr1 = null;
        
        // obtenemos la lista de usuarios por medio del metodo
        List<Usuario> listaUsuario = controlPersistencia.traerUsuarios();
        
        // iteramos la lista 
        for(Usuario user : listaUsuario){
            //vemos si los valores son iguales
            if (user.getUserName().equals(usuario) && user.getPass().equals(pass)) {
                return user;
            }
        }
        return null;
    }  
}
