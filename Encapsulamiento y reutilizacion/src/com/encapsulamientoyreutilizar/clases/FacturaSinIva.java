package com.encapsulamientoyreutilizar.clases;

public class FacturaSinIva extends Factura{
    public FacturaSinIva(int id, String concepto, double importe) {
        super(id, concepto, importe);
    }

    @Override
    public double calcularTotal() {
        return this.getImporte();
    }
}
