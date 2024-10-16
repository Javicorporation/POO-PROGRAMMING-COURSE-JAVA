package com.enums;

public class Test {

    public static void main(String[] args) {

        for (Color color : Color.values()) {
            System.out.println(color);
        }

        Color color1 = Color.VERDE;

        System.out.println(color1.name());
        System.out.println(color1.ordinal());


        try {
            color1 = Color.valueOf("ROJOH");
            System.out.println(color1);
            System.out.println(color1.ordinal());
        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("El valor no existe");
        }




    }
}
