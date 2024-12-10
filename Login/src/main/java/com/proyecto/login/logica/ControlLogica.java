package com.proyecto.login.logica;

import com.proyecto.login.persistencia.ControlPersistencia;
import java.util.List;

public class ControlLogica {
    
    ControlPersistencia controlPersistencia;

    public ControlLogica() {
        this.controlPersistencia = new ControlPersistencia();
    }
    
    

    public String validarUsuario(String pass, String usuario) {
        
        String mensaje = "";
        
        List<Usuario> listaUsuario = controlPersistencia.traerUsuarios();
        
        for(Usuario user : listaUsuario){
            if (user.getUserName().equals(usuario)) {
               if (user.getPass().equals(pass)) {
                   mensaje= "usuario y contraseña correcto, hola";
                   return mensaje;
               }else{
                   mensaje= "contraseña incorrecta";
                   return mensaje;
               }
           }else{
               mensaje= "usuario incorrecto";
               return mensaje;
           }
        }
        return mensaje;
    }
    
}
