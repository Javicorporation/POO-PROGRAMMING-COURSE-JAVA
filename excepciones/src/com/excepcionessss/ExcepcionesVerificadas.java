package com.excepcionessss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepcionesVerificadas{
    public static void main(String[] args) throws FileNotFoundException {
        readFile();

    }

    public static void readFile() throws FileNotFoundException {

        try {
            File file = new File("C://File.txt");
            FileReader fr = new FileReader(file);
        }catch (Exception e) {
            System.out.println("El archivo no es encontrado");
            e.printStackTrace(System.out);
        }

    }
}
