package com.ejerciciopoo.clases;

public class Postnet {
    public static final double DESCUENTO = 0.03;
    public static final int MINCUOTAS = 1;
    public static final int MAXCUOTAS = 6;

    public Tiket efectuarPago(double montoAAbonar, Tarjeta tarjeta, int catidadCuotas){
        Tiket tiketgenerardo = null;

        if(validarDatos(montoAAbonar, tarjeta, catidadCuotas)){
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(catidadCuotas);

            if (tarjeta.fondosDeTarjeta(montoFinal)){
                tarjeta.descontar(montoFinal);

                String nomAp = tarjeta.nombreAp();
                double montoPorCuotaPagar = montoFinal/catidadCuotas;
                tiketgenerardo = new Tiket(nomAp,montoFinal,montoPorCuotaPagar);
            }
        }
        return tiketgenerardo;
    }

    private boolean validarDatos(double monto,Tarjeta tarjeta, int cantidadCuotas){
        boolean montoValido = monto > 0;
        boolean tarjetaValida = tarjeta != null;
        boolean cantidadDeCuotas = cantidadCuotas >= MINCUOTAS && cantidadCuotas <=MAXCUOTAS;
        return montoValido && tarjetaValida && cantidadDeCuotas;
    }

    private double recargoSegunCuotas(int cantidadCuotas){
        return (cantidadCuotas-1)*DESCUENTO;
    }
}
