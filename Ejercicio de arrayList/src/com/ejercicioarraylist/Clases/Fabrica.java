package com.ejercicioarraylist.Clases;

import java.util.ArrayList;

public class Fabrica {
    ArrayList<Sucursal> listaSucursales;

    public Fabrica() {
        this.listaSucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.listaSucursales.add(sucursal);
    }
    public void listarIntrumentos(){
        for (Sucursal sucursal: listaSucursales){
            System.out.println( sucursal.getNombreSucursal());
            sucursal.listarInstrumentos();
        }
    }
}
