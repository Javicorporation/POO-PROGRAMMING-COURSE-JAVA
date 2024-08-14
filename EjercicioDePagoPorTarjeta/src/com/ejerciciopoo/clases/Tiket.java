package com.ejerciciopoo.clases;

public class Tiket {
    private String nombreapellido;
    private double montoPorFinalAPagar;
    private double montoCuota;

    public Tiket(String nombreapellido, double montoPorFinalAPagar, double montoCuota) {
        this.nombreapellido = nombreapellido;
        this.montoPorFinalAPagar = montoPorFinalAPagar;
        this.montoCuota = montoCuota;
    }

    @Override
    public String toString() {
        return "Tiket{" +
                "nombreapellido='" + nombreapellido + '\'' +
                ", montoPorFinalAPagar=" + montoPorFinalAPagar +
                ", montoCuota=" + montoCuota +
                '}';
    }
}
