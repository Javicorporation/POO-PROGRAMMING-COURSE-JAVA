package com.encapsulamientoyreutilizar.clases;

public class FacturaSinIva extends Factura{
    @Override
    public double calcularTotal() {
        return this.getImporte();
    }
}
