package com.interfacess;

import java.util.ArrayList;

public class PartidoDelBuenCode {

    private ArrayList <EnviadorDeMensajes> mensajeros;

    public PartidoDelBuenCode() {
        this.mensajeros = new ArrayList<>();
    }

    public void hacerCampaña(){
        for(EnviadorDeMensajes m : mensajeros){
            m.enviarMensaje("Holaaaaaaaaaaa");
        }
    }

    public void agregarMensajero(EnviadorDeMensajes mensaj){
        this.mensajeros.add(mensaj);
    }

}
