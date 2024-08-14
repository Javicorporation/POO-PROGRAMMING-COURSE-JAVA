package com.ejerciciopoo.clases;

public class Tarjeta {
    private String nombreEntidadBancaria;
    private String numeroTarjeta;
    private double saldoDisponible;
    private Titular titular;
    private NombreEntidadFinanciera nombreEntidadFinanciera;

    public Tarjeta(String nombreEntidadBancaria, String numeroTarjeta, double saldoDisponible, Titular titular, NombreEntidadFinanciera nombreEntidadFinanciera) {
        this.nombreEntidadBancaria = nombreEntidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
        this.nombreEntidadFinanciera = nombreEntidadFinanciera;
    }

    public String getNombreEntidadBancaria() {
        return nombreEntidadBancaria;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public Titular getTitular() {
        return titular;
    }

    public NombreEntidadFinanciera getNombreEntidadFinanciera() {
        return nombreEntidadFinanciera;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "nombreEntidadBancaria='" + nombreEntidadBancaria + '\'' +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                ", saldoDisponible=" + saldoDisponible +
                ", titular=" + titular +
                ", nombreEntidadFinanciera=" + nombreEntidadFinanciera +
                '}';
    }
}
