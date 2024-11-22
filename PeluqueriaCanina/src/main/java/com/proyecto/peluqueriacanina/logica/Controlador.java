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

    public Mascota traerMascotas(int numCliente) {
        controladorPersistencia.traerMascotas(numCliente);
    }

   
    
    
}
