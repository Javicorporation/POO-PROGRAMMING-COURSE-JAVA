package com.comodines;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Auto> autos = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();


        autos.add(new Auto("RYUEWR", "verde"));
        autos.add(new Auto("GDBNDC", "azul"));
        autos.add(new Auto("UIRYRE", "cafe"));

//        personas.add(new Persona("carlos", "paz"));
//        personas.add(new Persona("mario", "carl"));
//        personas.add(new Persona("luis", "luz"));


        Deportista luis = new Deportista("luis", "paz", 100);
        Deportista mario = new Deportista("mario", "paz", 100);
        Deportista carla = new Deportista("carla", "paz", 100);

        Futbolista carmen = new Futbolista("carmen", "luz", 200, 20);
        Futbolista martha = new Futbolista("martha", "luz", 200, 20);
        Futbolista lucia = new Futbolista("lucia", "luz", 200, 20);

        personas.add(luis);
        personas.add(mario);
        personas.add(carla);
        personas.add(martha);
        personas.add(lucia);
        personas.add(carmen);

        ArrayList<Deportista> deportistas = new ArrayList<>();
        deportistas.add(luis);
        deportistas.add(mario);
        deportistas.add(carla);

        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(carmen);
        futbolistas.add(martha);
        futbolistas.add(lucia);

        // una coleccion de autos no puede ser considerado una lista de objetos
        //UtilListas.mostrarLista(autos);

        UtilListas.mostrarListaDePersonas(deportistas);
    }
}
