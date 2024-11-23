package com.proyecto.peluqueriacanina.logica;

import com.proyecto.peluqueriacanina.persistencia.ControladorPersistencia;
import java.util.List;

public class Controlador {
    ControladorPersistencia controladorPersistencia = new ControladorPersistencia();

    public void guardar(String color, String celDuenio, String nombre, String nombreDuenio, String observacion, String raza, String alergico, String atencion) {
    
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombre);
        mascota.setAlergico(alergico);
        mascota.setRaza(raza);
        mascota.setAtencionEspecial(atencion);
        mascota.setColor(color);
        mascota.setObservacion(observacion);
        mascota.setDuenio(duenio);
        
        controladorPersistencia.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return controladorPersistencia.traerMascotas();    
    }

    public void borrarMascota(int numCliente) {
        controladorPersistencia.eliminarMascota(numCliente);
    }

    public Mascota traerMascota(int numCliente) {
        return controladorPersistencia.traerMascotas(numCliente);
    }

    public void modificarMascota(Mascota mascota, String color, String nombre, 
            String observacion, String raza, String alergico, String atencion, 
            String nombreDuenio, String celDuenio) {
        
        mascota.setColor(color);
        mascota.setNombre(nombre);
        mascota.setObservacion(observacion);
        mascota.setRaza(raza);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencion);
        
        // cremos un metodo para modificar la mascota
        controladorPersistencia.modificarMascota(mascota);
        
        // seteo valores del dueño 
        Duenio duenio = this.buscarDuenio(mascota.getDuenio().getId());
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        this.modificarDuenio(duenio);
    }

    // metodo para modificar dueño 
    private Duenio buscarDuenio(int id) {
        return controladorPersistencia.traerDuenio(id);
    }

    private void modificarDuenio(Duenio duenio) {
        controladorPersistencia.modificarDuenio(duenio);
    }

    

   

   
    
    
}
