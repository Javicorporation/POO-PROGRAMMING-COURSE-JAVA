package com.exce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTxt {
    public void mostrarTxt(String ruta) throws IOException {
        File elArchivo = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(elArchivo));
        System.out.println(br.readLine());
    }
}
