package com.interfacess.Caja1;

import com.interfacess.EnviadorDeMensajes;

public class PalomaMensajera extends Ave implements EnviadorDeMensajes {

    public void volarRapido(){
        System.out.print("Volandooooooo...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println("Papel soltado: "+ mensaje);
    }
}
