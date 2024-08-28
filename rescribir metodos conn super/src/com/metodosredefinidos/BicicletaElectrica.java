package com.metodosredefinidos;

public class BicicletaElectrica extends Bicicletas{
    private final int POT_MAX = 400;
    private int potencia;


    public BicicletaElectrica(String marca, int rodado, int cantidadKl, int potencia) {
        super(marca, rodado, cantidadKl);
        this.potencia = potencia;
    }

    // método heredado y sobre escrito
    // pero que pasa si queremos usar la logica de el metodo de la clase padre.
    // puedes usar super
    @Override
    boolean servicioUsable(){
        return this.potencia < POT_MAX && super.servicioUsable();
    }
}
