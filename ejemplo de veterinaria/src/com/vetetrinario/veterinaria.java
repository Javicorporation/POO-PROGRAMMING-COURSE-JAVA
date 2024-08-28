package com.vetetrinario;

import java.util.ArrayList;

public class veterinaria {

    private ArrayList<Mascota> mascotas;
    public veterinaria() {
        this.mascotas = new ArrayList<>();
    }

    public void agregarmascota(Mascota mascota){
        this.mascotas.add(mascota);
    }
    public void saludarACliente(){
        for(Mascota mascota : mascotas){
            mascota.expresarse();
        }
    }
}
