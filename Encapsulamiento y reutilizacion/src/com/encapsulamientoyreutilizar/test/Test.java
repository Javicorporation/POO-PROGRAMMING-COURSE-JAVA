package com.encapsulamientoyreutilizar.test;

import com.encapsulamientoyreutilizar.clases.Factura;
import com.encapsulamientoyreutilizar.clases.FacturaConIva;
import com.encapsulamientoyreutilizar.clases.FacturaSinIva;

public class Test {

    public static void main(String[] args) {
        FacturaConIva fi = new FacturaConIva();
        fi.setId(1);
        fi.setImporte(100);
        System.out.println("factura con IVA: ");
        imprimirImporte(fi);
        System.out.println();

        FacturaSinIva fsi = new FacturaSinIva();
        fsi.setId(2);
        fsi.setImporte(100);
        System.out.println("factura sin IVA: ");
        imprimirImporte(fsi);
    }

    public static void imprimirImporte(Factura f){
        System.out.println(f.calcularTotal());
    }
}
