package com.sobrecargasobreescritura;

public class Animal {
    private int id;
    private String name;

    //gets - sets


    //constructores

    // sobrecarga
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

    public void hacerSonido(String nombre){
        System.out.println("El animal "+nombre+" hace un sonido");
    }

    public void hacerSonido(String nombre, String tiposonido){
        System.out.println("El animal"+nombre+" hace un sonido"+tiposonido);
    }

}
