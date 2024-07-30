package objeto;

import java.util.Scanner;

public class Test {
    public Scanner getting = new Scanner(System.in);

    public static void main(String[] args) {

        // instanciamos la clase auto en un objetos auto
        // los valores que se obtinen son: null, null, null, 0, false
        // estos datos son los que java ponen por defecto
        Auto auto = new Auto();
        auto.patente = "USE";
        auto.color = "Gris";
        auto.modelo = "Mazda";
        auto.kilometros = 100;
        auto.conAire = true;

        System.out.println(auto.patente+" "+auto.color+" "+auto.modelo+" "+auto.kilometros+" "+auto.conAire);




    }
}