package com.dependencias.Principal;

import com.dependencias.Clases.Documento;
import com.dependencias.Clases.Impresora;

public class Principal {
    public static void main(String[] args) {
        Documento doc1 = new Documento("El juanin", "es la cabraaaaaaaa");
        Impresora impresora = new Impresora();
        impresora.estaEncendida();
        impresora.imprimir(doc1);

    }
}
