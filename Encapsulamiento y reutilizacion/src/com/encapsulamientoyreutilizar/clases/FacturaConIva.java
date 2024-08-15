package com.encapsulamientoyreutilizar.clases;

public class FacturaConIva extends Factura{


    @Override
    public double calcularTotal() {
        return this.getImporte()*1.21;
    }
}
