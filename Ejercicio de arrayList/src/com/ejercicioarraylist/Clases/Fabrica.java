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

    public Sucursal buscarSucursal(String nombre){
        Sucursal sucursalABuscar = null;
        int i = 0;
        while (i < listaSucursales.size() && !listaSucursales.get(i).getNombreSucursal().equalsIgnoreCase(nombre)){
            sucursalABuscar = listaSucursales.get(i);
            i++;
        }
        if (i < listaSucursales.size()){
            sucursalABuscar =this.listaSucursales.get(i);
        }


        return sucursalABuscar;
    }

    public double[] porcentajeIntrumento(String nombre){
        double[] porcentajes = null;
        Sucursal sucursalEncontrada = buscarSucursal(nombre);
        if(sucursalEncontrada != null){
            porcentajes= sucursalEncontrada.porcentajeIntrumentoPorTipo(nombre);
        }
        return porcentajes;
    }
}
