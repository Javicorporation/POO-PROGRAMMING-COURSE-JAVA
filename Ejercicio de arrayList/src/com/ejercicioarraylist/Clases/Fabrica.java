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

            ArrayList<Instrumento> listaSucursalTipo = sucursal.obtenerIntrumentoPorTipo(tipo);
            for (Instrumento i : listaSucursalTipo){
                listaTipo.add(i);
            }
        }
        return listaTipo;
    }

    public Instrumento borrarElemeto(String id){
        Instrumento borrado = null;
        int i = 0;
        while (i < listaSucursales.size() && borrado == null){
            borrado = listaSucursales.get(i).borraintrumentoId(id);
            i++;
        }

        return borrado;
    }
}
