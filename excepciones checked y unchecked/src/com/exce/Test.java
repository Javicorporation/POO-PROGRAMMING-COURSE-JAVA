package com.exce;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        VisorDeTxt v = new VisorDeTxt();
        try {
            v.mostrarTxt("C:\\Users\\krchi\\OneDrive - Universidad de Guayaquil\\CURSOS - PROTECTOS\\JAVA\\JAVAPOO\\excepciones checked y unchecked\\src\\com\\exce\\hola.tx");
        }catch (FileNotFoundException ex){
            System.out.println("El archivo no existe");
        }catch (IOException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }

    }
}
