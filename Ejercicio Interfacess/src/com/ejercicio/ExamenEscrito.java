package com.ejercicio;

public class ExamenEscrito extends Examen{

    private static final int MINNOTA = 0;
    private static final int MAXNOTA = 10;
    private static final int NOTAAPRO = 6;
    private static final int MINDURA = 90;
    private int duracion;
    private int nota;

    public ExamenEscrito(String fecha, int duracion, int nota) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public boolean aprobable() {
        return nota >= NOTAAPRO && duracion <= MINNOTA;
    }
}
