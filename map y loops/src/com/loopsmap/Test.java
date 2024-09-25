package com.loopsmap;

import com.loopsmap.clase.Persona;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("123","juanin", 30);
        Persona p2= new Persona("456","juan",40);
        Persona p3= new Persona("231","ana",50);

        Map<String , Persona> mapa = new HashMap();
        // guardar en el mapa que acepta 2 parametros
        mapa.put(p1.getDni(), p1);
        mapa.put(p2.getDni(), p2);
        mapa.put(p3.getDni(), p3);


        for (Map.Entry<String, Persona> entrada: mapa.entrySet()){
            Persona otra = entrada.getValue();
            System.out.println(otra.getDni());
            System.out.println(otra.getNombre());
            System.out.println(otra.getEdad());
        }
        System.out.println();
        // con lamdas
        mapa.forEach((k,Persona) -> System.out.println(k+"\n"+Persona.getNombre()+" "+Persona.getEdad()));


    }
}
