package com.encapsulamientoyreutilizar.clases;

public class FacturaReducido extends Factura{
    public FacturaReducido(int id, String concepto, double importe) {
        super(id, concepto, importe);
    }

    @Override
    public double calcularTotal() {
        return this.getImporte();
    }
}
