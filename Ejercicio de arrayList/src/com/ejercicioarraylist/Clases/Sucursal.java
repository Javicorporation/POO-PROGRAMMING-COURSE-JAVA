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

    private Instrumento buscarInstrumento(String id){
        Instrumento instrumentoABuscar= null;
        int i = 0;
        while (i < instrumentos.size() && !this.instrumentos.get(i).getID().equalsIgnoreCase(id)) {
            i++;
        }
        if (i < instrumentos.size()){
            instrumentoABuscar = this.instrumentos.get(i);
        }
        return instrumentoABuscar;
    }

    public Instrumento borraintrumentoId (String id){
        Instrumento intrumentoABorrar = buscarInstrumento(id);
        this.instrumentos.remove(intrumentoABorrar);
        return intrumentoABorrar;
    }

    public double[] porcentajeIntrumentoPorTipo(String nombre){
        final int CANTIDAD_INTRUMENTOS = TipoInstrumento.values().length;
        double[] porcentajeIntrumento = new double[CANTIDAD_INTRUMENTOS];
        for (Instrumento instrumento : instrumentos){
            porcentajeIntrumento[instrumento.getTipo().ordinal()]++;
        }
        porcentajeAbsoluto(porcentajeIntrumento);
        return porcentajeIntrumento;
    }


    public void porcentajeAbsoluto(double[] porcentajeIntrumento){
        for (int i = 0; i < porcentajeIntrumento.length; i++) {
            porcentajeIntrumento[i] = (porcentajeIntrumento[i]*100)/instrumentos.size();
        }
    }



}
