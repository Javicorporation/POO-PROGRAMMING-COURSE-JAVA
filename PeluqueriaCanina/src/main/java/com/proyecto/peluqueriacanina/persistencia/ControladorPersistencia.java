package com.proyecto.peluqueriacanina.persistencia;

import com.proyecto.peluqueriacanina.logica.Duenio;
import com.proyecto.peluqueriacanina.logica.Mascota;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    
    DuenioJpaController duenioJpaController = new DuenioJpaController();
    MascotaJpaController mascotaJpaController = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJpaController.create(duenio);
        mascotaJpaController.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpaController.findEntities();
    }

    public void eliminarMascota(int numCliente) {
        try {
            mascotaJpaController.destroy(numCliente);
        } catch (NullPointerException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null,ex);
        }
        
    }

    public Mascota traerMascotas(int numCliente) {
        return mascotaJpaController.find(numCliente);
    }

    
    
    
    
    
}
