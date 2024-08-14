package com.ejerciciopoo.test;

import com.ejerciciopoo.clases.*;

public class Test {
    public static void main(String[] args) {
        Postnet postnet = new Postnet();
        Titular user1 = new Titular("467364","juanin", "Habat","0987654321","fjdhfj@gmai.com");
        Tarjeta tarjeta1 = new Tarjeta("BPichincha","637363755", 20000, user1, NombreEntidadFinanciera.BIRZA);

        System.out.println("Targeta antes de pago: \n"+ tarjeta1);
        System.out.println();

        System.out.println("tiket tras pagar");
        Tiket tiket = postnet.efectuarPago(100,tarjeta1,5);
        System.out.println(tiket);
        System.out.println();

        System.out.println("Targeta despues de pago: \n"+ tarjeta1);
    }
}
