package com.ejercicio;

public class Principal {
    public static void main(String[] args) {

        UnidadEducativa unidad = new UnidadEducativa();

        Alumno Juanin = new Alumno("123", "Juanin", "Carlo");
        Alumno Maria = new Alumno("776", "Maria", "luz");
        Alumno Luis = new Alumno("876", "Luis", "luz");

        Juanin.agregarExamen(new ExamenEscrito("00/00/00",40, 7));
        Juanin.agregarExamen(new ExamenOral("00/00/00", NivelDeSatisfaccion.SUFICIENTE));

        Maria.agregarExamen(new ExamenEscrito("00/00/0000",60, 4));
        Maria.agregarExamen(new ExamenEscrito("00/00/0000",65, 8));
        Maria.agregarExamen(new ExamenOral("00/00/0000", NivelDeSatisfaccion.EXCELENTE));

        Luis.agregarExamen(new ExamenEscrito("00/00/0000",100, 9));
        Luis.agregarExamen(new ExamenOral("00/00/0000", NivelDeSatisfaccion.INSUFICIENTE));
        Luis.agregarExamen(new ExamenOral("00/00/0000", NivelDeSatisfaccion.EXCELENTE));

        unidad.agregarAlumno(Juanin);
        unidad.agregarAlumno(Maria);
        unidad.agregarAlumno(Luis);

        System.out.println("Cantidad de aprobados: "+ unidad.cantidadAprobados());


    }
}
