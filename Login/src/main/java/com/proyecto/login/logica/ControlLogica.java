package com.proyecto.login.logica;

import com.proyecto.login.persistencia.ControlPersistencia;
import java.util.List;

public class ControlLogica {
    
    ControlPersistencia controlPersistencia;

    public ControlLogica() {
        this.controlPersistencia = new ControlPersistencia();
    }
    
    

    public boolean validarUsuario(String pass, String usuario) {
        
        //String mensaje = "";
        boolean ok = false;
        
        List<Usuario> listaUsuario = controlPersistencia.traerUsuarios();
        
        for(Usuario user : listaUsuario){
            if (user.getUserName().equals(usuario)) {
               if (user.getPass().equals(pass)) {
                   //mensaje= "usuario y contraseña correcto, hola";
                   ok = true;
                   return ok;
               }else{
                   //mensaje= "contraseña incorrecta";
                   ok = false;
                   return ok;
               }
           }else{
               //mensaje= "usuario incorrecto";
               ok = false;
               return ok;
           }
        }
        return ok;
    }

    public String validarRol(String usuario) {
        return "j";
    }
    
}
