package com.ejercicioarraylist.Ejecutable;

import com.ejercicioarraylist.Clases.Fabrica;
import com.ejercicioarraylist.Clases.Instrumento;
import com.ejercicioarraylist.Clases.Sucursal;
import com.ejercicioarraylist.Clases.TipoInstrumento;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        cargarfabrica(fabrica);
        //fabrica.listarIntrumentos();
//
//        Instrumento instrumento = fabrica.borrarElemeto("HDPUIY");
//        System.out.println("Elememto borrado: "+ instrumento);
//
//        fabrica.listarIntrumentos();

//        ArrayList<Instrumento> lista= fabrica.obtenerIntrumentoPorTipo(TipoInstrumento.VIENTO);
//        for (Instrumento i : lista){
//            System.out.println(i);
//        }

        double[] porcentajes =  fabrica.porcentajeIntrumento("Lana");
        for (int i = 0; i < porcentajes.length; i++) {
            System.out.println(porcentajes[i]);

        }


    }

    // metodo para cargar la fabrica
    public static void cargarfabrica(Fabrica fabrica){
        // creamos sucursales
        Sucursal a = new Sucursal("Lana");
        Sucursal b = new Sucursal("mini");

        // agregamos instrumentos a las sucursales existentes
        //a.agregarInstrumento(new Instrumento("HDDHDF",123, TipoInstrumento.CUERDA));
        a.agregarInstrumento(new Instrumento("VNNHDF",143, TipoInstrumento.PERCUSION));
        a.agregarInstrumento(new Instrumento("HDDERF",163, TipoInstrumento.VIENTO));

        b.agregarInstrumento(new Instrumento("EQQWQF",183, TipoInstrumento.CUERDA));
        b.agregarInstrumento(new Instrumento("HDPUIY",193, TipoInstrumento.PERCUSION));
        b.agregarInstrumento(new Instrumento("QWQQWQ",103, TipoInstrumento.VIENTO));

        // agregamos las sucursales a la fabrica
        fabrica.agregarSucursal(a);
        fabrica.agregarSucursal(b);
    }
}
