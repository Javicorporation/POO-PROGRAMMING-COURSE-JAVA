package com.peliculas.clases;

import javax.swing.*;
import java.util.ArrayList;

public class ImpCatalogoPelicula implements ICatalogoPeliculas{
    private final ArrayList<String> listaDePeliculas;

    public ImpCatalogoPelicula() {
        this.listaDePeliculas = new ArrayList<>();
    }

    @Override
    public void insertarpelicula(Peliculas pelicula) {
        this.listaDePeliculas.add(pelicula.toString());
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(null, this.listaDePeliculas, "Lista de Peliculas",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void buscarPelicula(String pelicula) {
        String resultado = null;
        for (var peliculas: this.listaDePeliculas) {
            if (peliculas.toString().equals(pelicula)) {
                resultado = pelicula;
            }
        }


        if(pelicula.equals(resultado)){
            JOptionPane.showMessageDialog(null, "Resultado ->"+resultado, "Busqueda de pelicula", JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "no se encontro la pelicula", "Busqueda de pelicula", JOptionPane.WARNING_MESSAGE);
        }

    }
}
