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

    public ArrayList<Instrumento> obtenerIntrumentoPorTipo(TipoInstrumento tipo){
        ArrayList<Instrumento> listaTipo = new ArrayList<>();
        for (Sucursal sucursal: listaSucursales){
            // para evitar un foreach y recorres cada sucursal por buscar podemos unar el método .addAll en listaTipo
            listaTipo.addAll(sucursal.obtenerIntrumentoPorTipo(tipo));
        }
        return listaTipo;
    }
}
