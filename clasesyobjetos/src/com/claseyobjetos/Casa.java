package com.claseyobjetos;

import java.util.ArrayList;

public class Casa {

    private ArrayList<Habitacion> habitaciones =  new ArrayList<>();

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    // metodo agregar bombilla
    public void agregarBombilla(Habitacion habitacion){
        habitaciones.add(habitacion);
    }

    // obtener bombilla con mayor gasto
    public Bombilla bombillaConMayorGasto(){

        Bombilla bombillamayorGast = new Bombilla(0);
        for (Habitacion h : habitaciones){
            for (Bombilla b : h.getBombillas()){
                if (bombillamayorGast.getPotencia()<b.getPotencia()) {
                    bombillamayorGast = b;
                }
            }
        }
        return bombillamayorGast;
    }
}
