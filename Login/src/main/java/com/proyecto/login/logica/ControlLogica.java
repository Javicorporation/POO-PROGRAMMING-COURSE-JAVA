package com.proyecto.login.logica;

import com.proyecto.login.persistencia.ControlPersistencia;
import java.util.List;

public class ControlLogica {
    
    ControlPersistencia controlPersistencia = new ControlPersistencia();

    public String validarUsuario(String usuario, String pass) {
        String mensaje = "";
        
        List<Usuario> listaDeUsuarios = ControlPersistencia.traerUsuarioos();
        
        for(Usuario user : listaDeUsuarios){
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
