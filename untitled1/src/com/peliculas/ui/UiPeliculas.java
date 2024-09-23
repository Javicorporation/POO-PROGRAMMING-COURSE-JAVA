package com.peliculas.ui;

import com.peliculas.clases.ICatalogoPeliculas;
import com.peliculas.clases.ImpCatalogoPelicula;
import com.peliculas.clases.Peliculas;

import javax.swing.*;

public class UiPeliculas {

    public static void interfaceDePeliculas() {
        ICatalogoPeliculas peliculas = new ImpCatalogoPelicula();
        Peliculas pelicula;
        boolean loop = false;


        while (!loop) {
            String opcion = JOptionPane.showInputDialog(
                    null, "1 - Insertar Pelicula.\n"
                            + "2 - Listar Peliculas.\n"
                            + "3 - Buscar Pelicula.\n"
                            + "4 - Salir.\n",
                            "Ingrese una opcion",3);


            switch (opcion) {
                case "1":
                    String nombreP = JOptionPane.showInputDialog(null,
                            "Ingrese el nombre del Pelicula.",
                            "entrada",
                            3);
                    pelicula = new Peliculas(nombreP);
                    peliculas.insertarpelicula(pelicula);
                    break;
                    case "2":
                        peliculas.listarPelicula();
                        break;
                    case "3":
                            String nombrePe = JOptionPane.showInputDialog(null,
                                    "Ingrese el nombre del Pelicula.",
                                    "entrada",
                                    3);
                            peliculas.buscarPelicula(nombrePe);
                        break;
                    case "4":
                        System.out.println("Adios");
                        loop = true;
                        break;
                        default:
                            JOptionPane.showMessageDialog(
                                    null,
                                    "opcion Incorrecta\n"+
                                            "vuelve a intentarlo\n"+
                                            "ingresa una opcion correcta\n"+
                                            "las opciones son del 1 al 4\n","Error",JOptionPane.ERROR_MESSAGE);

            }



        }
    }
}
