package com.ejerciciocombos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comedor {
    public Scanner getting = new Scanner(System.in);
    private List<ComboDeComida> combos;

    public Comedor() {
        this.combos = new ArrayList<>();
    }

    public void  agregarComida(ComboDeComida comida){
        this.combos.add(comida);
    }


    public void menu(){
        int opcion = 0;
        System.out.println();
    }


}
