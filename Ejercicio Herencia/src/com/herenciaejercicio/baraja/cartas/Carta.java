package com.herenciaejercicio.baraja.cartas;

// creamos la clase carta con un atributo tapada
public abstract class Carta {
    private boolean tapada;

    public boolean isTapada() {
        return tapada;
    }

    // creamos constructor vacio
    public Carta() {
        this.tapada = true;
    }

    // funciones
    public void darVuelta(){
        tapada = !tapada;
    }

    // para evitar repetir esta lógica
    // podemos crear una funcion para solo lo que cambia
    public void mostrar(){
        if (tapada){
            System.out.println("***************************");
        }else {
            System.out.println(obtenerCarta());
        }
    }

    // metodo para reutilizar
    public String obtenerCarta(){
        return "Ests e una carta generica";
    }

    @Override
    public String toString() {
        return "Carta{" +
                "tapada=" + tapada +
                '}';
    }
}
