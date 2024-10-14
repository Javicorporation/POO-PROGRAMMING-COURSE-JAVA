package com.casteo;

public class Test {
    public static void main(String[] args) {

        double num = 1.67;
        //casteo entero
        int numint = (int) num;
        // casteo long
        long numlong = (long) num;

//        System.out.println("double - "+num);
//        System.out.println("int - "+numint);
//        System.out.println("long - "+numlong);


        // String a entero o double
        String cantidad = "15";
        String precio = "150.27";

        int numEntero = Integer.parseInt(cantidad);
        double numDouble = Double.parseDouble(precio);

//        System.out.println(numDouble);
//        System.out.println(numEntero);
//        System.out.println(" "+ numDouble * numEntero);


        // datos numericos a String
        int edad = 30;
        double estatura = 1.67;

        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);



    }
}
