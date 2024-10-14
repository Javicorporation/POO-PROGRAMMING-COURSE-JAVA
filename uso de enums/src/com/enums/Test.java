package com.enums;

public class Test {
    enum Color{
        RED, BLACK, WHITE
    }
    public static void main(String[] args) {
        Color color = Color.BLACK;

        //System.out.println("El color es: "+color);

        for (Color c : Color.values()) {
            System.out.println("El color es: "+c);
        }

    }
}
