package com.ejerciciopoo.clases;

public class Postnet {
    public final double DESCUENTO = 0.03;
    public final int MINCUOTAS = 1;
    public final int MAXCUOTAS = 6;

    public Tiket efectuarPago(double monto, Tarjeta tarjeta, int catidadCuotas){
        Tiket tiketgenerardo = null;

        if(validarDatos()){
            if (tarjeta.fondosDeTarjeta(monto)){
                tarjeta.descontar(monto);

                String nomAp = tarjeta.nombreAp();
                double montoPorFinalAPagar = monto/catidadCuotas;
                tiketgenerardo = new Tiket(nomAp,montoPorFinalAPagar,monto);
            }
        }
        return tiketgenerardo;
    }

    private boolean validarDatos(){
        return true;
    }
}
