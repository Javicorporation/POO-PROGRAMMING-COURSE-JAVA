package com.ejercicio;

public class ExamenOral extends Examen{

//    private int duracion;
//    private int nota;
    private NivelDeSatisfaccion nivelDeSatisfaccion;

    public ExamenOral(String fecha, NivelDeSatisfaccion nivelDeSatisfaccion) {
        super(fecha);
        this.nivelDeSatisfaccion = nivelDeSatisfaccion;
    }

    @Override
    public boolean aprobable() {
        return nivelDeSatisfaccion.ordinal() >= NivelDeSatisfaccion.SUFICIENTE.ordinal();
    }
}
