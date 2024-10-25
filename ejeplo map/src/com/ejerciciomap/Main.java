package com.ejerciciomap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> edades = new HashMap<>();


        edades.put("Ana", 1);
        edades.put("Maria", 2);
        edades.put("Carla", 3);
        edades.put("Amanda", 4);


        if (edades.containsKey("Ana")) {
            System.out.println("si esta");
        }else{
            System.out.println("no esta");
        }
        for (Map.Entry<String, Integer> entry : edades.entrySet()) {
            //presentamos las claves y los valores
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
