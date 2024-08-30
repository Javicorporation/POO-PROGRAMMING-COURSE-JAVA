package com.interfacess.caja2;

import com.interfacess.EnviadorDeMensajes;

public class TelefonoMovil extends Dispositivo implements EnviadorDeMensajes {

    public void llamar(){
        System.out.print("Llamando..");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        llamar();
        System.out.println("El mensaje que llego es: "+mensaje);

    }
}
