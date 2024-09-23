package com.peliculas.test;

import javax.swing.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog(null, "Ingrese un texto: ","Entrada",3);
        JOptionPane.showMessageDialog(null, valor,"error..",JOptionPane.ERROR_MESSAGE);
    }
}
