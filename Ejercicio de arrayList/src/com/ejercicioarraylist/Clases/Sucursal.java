package com.ejercicioarraylist.Clases;

import java.util.ArrayList;

public class Sucursal {
    private String nombreSucursal;
    ArrayList<Instrumento> instrumentos;

    public Sucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
        this.instrumentos = new ArrayList<>();
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombreSucursal='" + nombreSucursal + '\'' +
                '}';
    }

    public void listarInstrumentos() {
        for (Instrumento instrumento : instrumentos){
            System.out.println(instrumento);
        }
    }

    public void agregarInstrumento(Instrumento instrumento){
        instrumentos.add(instrumento);
    }

    public ArrayList<Instrumento> obtenerIntrumentoPorTipo(TipoInstrumento tipo){
        ArrayList<Instrumento> listaTipo = new ArrayList<>();
        for (Instrumento instrumento : instrumentos){
            if (instrumento.getTipo() == tipo) {
                listaTipo.add(instrumento);
            }
        }
        return listaTipo;
    }
}
