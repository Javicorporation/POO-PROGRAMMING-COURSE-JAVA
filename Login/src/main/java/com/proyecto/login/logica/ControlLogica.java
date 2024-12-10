package com.proyecto.login.logica;

import com.proyecto.login.persistencia.ControlPersistencia;
import java.util.List;

public class ControlLogica {
    
    ControlPersistencia controlPersistencia;

    public ControlLogica() {
        this.controlPersistencia = new ControlPersistencia();
    }
    
    

    public String validarUsuario(String usuario, String pass) {
        
        String mensaje = "";
        
        List<Usuario> listaUsuario = controlPersistencia.traerUsuarios();
        for(Usuario user : listaUsuario){
            if (user.getUserName().equals(usuario)) {
               if (user.getPass().equals(pass)) {
                   mensaje= "usuario y contraseña correcto, hola";
               }else{
                   mensaje= "contraseña incorrecta";
               }
           }else{
               mensaje= "usuario incorrecto";
           }
        }
        return mensaje;
    }
    
}
