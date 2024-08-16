package com.encapsulamientoyreutilizar.clases;

public class FacturaConIva extends Factura{


    public FacturaConIva(int id, String concepto, double importe) {
        super(id, concepto, importe);
    }

    @Override
    public double calcularTotal() {
        return this.getImporte()*1.21;
    }
}
