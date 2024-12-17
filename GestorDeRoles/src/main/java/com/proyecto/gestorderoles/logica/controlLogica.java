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

  

    public List<Rol> obtenerRol() {
        return controlPersitencia.obtenerRol();
    }

    public void crearUser(String userName, String password, String rolName) {
        User user = new User();
        user.setUserName(userName);
        user.setPass(password);
        
        // buscar el rol en la base de datos
        
        // creamos un rol
        Rol rolAObtener = new Rol();
        //a ese rol le asignamos el rol que debuelve el metodo
        rolAObtener = this.traerRol(rolName);
        // si rol es diferente de null se asigna el rol, si no se queda nulo
        if (rolAObtener != null) {
            user.setRol(rolAObtener);
        }
        controlPersitencia.crearUsuario(user);
        
        
        
        
    }

    private Rol traerRol(String rolName) {
        List<Rol> listaRoles = controlPersitencia.traerRoles();
        
        for(Rol rol : listaRoles){
            if (rol.getNombreRol().equals(rolName)) {
                return rol;
            }
        }
        return null;
    }
    
}
