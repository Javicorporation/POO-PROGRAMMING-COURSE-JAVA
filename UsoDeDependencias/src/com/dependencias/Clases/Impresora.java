package com.dependencias.Clases;

public class Impresora {

    private boolean estaEncendida ;

    public boolean estaEncendida() {
        return  estaEncendida = true;
    }

    public void imprimir(Documento doc){
        if (estaEncendida) {
            System.out.println("impriminendo el documento: ["+doc.getTitulo()+"]");
            System.out.println("******************************");
            System.out.println(doc.getCuerpo());
            System.out.println("******************************");
        }else {
            System.out.println("La impresora esta apagada");
        }
    }

}
