package com.interfacess;

import com.interfacess.Caja1.PalomaMensajera;
import com.interfacess.caja2.TelefonoMovil;

public class Test {

    public static void main(String[] args) {
        PartidoDelBuenCode partido = new PartidoDelBuenCode();
        partido.agregarMensajero(new PalomaMensajera());
        partido.agregarMensajero(new TelefonoMovil());
        partido.agregarMensajero(new PalomaMensajera());
        partido.agregarMensajero(new TelefonoMovil());
        partido.agregarMensajero(new PalomaMensajera());
        partido.agregarMensajero(new TelefonoMovil());

        partido.hacerCampaña();
    }
}
