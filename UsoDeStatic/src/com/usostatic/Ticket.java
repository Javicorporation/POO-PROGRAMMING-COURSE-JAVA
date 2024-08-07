package com.usostatic;

public class Ticket {
    private static  int contador = 0;
    private int numeroTik;
    private String fecha;
    private String CIPersona;

    public Ticket(String fecha, String CIPersona) {
        contador++;
        this.numeroTik = contador;
        this.fecha = fecha;
        this.CIPersona = CIPersona;
    }

    @Override
    public String toString() {
        return "Tiket{" +
                "numeroTik=" + numeroTik +
                ", fecha='" + fecha + '\'' +
                ", CIPersona='" + CIPersona + '\'' +
                '}';
    }
}
