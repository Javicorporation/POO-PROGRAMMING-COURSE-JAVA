package com.exce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTxt {
    // implementacion de excepciones
    public void mostrarTxt(String ruta) throws IOException {
        File elArchivo = new File(ruta);
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(elArchivo));
            System.out.println(br.readLine());
            // IOException de abarca las entradas y salidas
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new RuntimeException("error inesperado en el catch");
        }finally {  // uso del final para liberar recursos(el recurso que queramos liberar debe estar fuera del tryCatch, en este caso el BufferedReader)
            try {
                br.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
