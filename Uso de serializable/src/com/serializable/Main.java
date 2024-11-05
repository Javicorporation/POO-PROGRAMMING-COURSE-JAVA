package com.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

//        FileOutputStream fileOutputStream = new FileOutputStream("fichero.txt");
        Persona persona = new Persona();
        persona.setNombre("Jose");
        persona.setEdad(23);

        FileOutputStream fileOutputStream = new FileOutputStream("fichero.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(persona);
        objectOutputStream.close();




    }
}
