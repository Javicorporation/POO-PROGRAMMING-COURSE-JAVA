package objeto;

import java.util.Scanner;

public class Test {
    public Scanner getting = new Scanner(System.in);

    public static void main(String[] args) {

        // instanciamos la clase auto en un objetos auto
        // los valores que se obtinen son: null, null, null, 0, false
        // estos datos son los que java ponen por defecto

        //-- si creamos un objeto de la clase Auto llamado "auto",
        // no significa que en es variable "auto" se va a guardar tod el objeto
        // si no que a esa variable se va a asignar un identificador de ese objeto


        Auto auto = new Auto();
        System.out.println(auto);  //por lo cual se imprimira la identidad del objeto
//        auto.patente = "USE";
        auto.color = "Gris";
//        auto.modelo = "Mazda";
//        auto.kilometros = 100;
//        auto.conAire = true;
        System.out.println(auto.color);


        // creamos otra variable de tipo Auto,  la cual solo va a aceptar valores de tipo auto
        // la siguente linea daria error ya que estamos pasando un valor tipo int
        // Auto auto2 = 1;

        Auto auto2 = auto;
        System.out.println(auto2);
        auto2.color = "azul";
        System.out.println(auto.color);
        //System.out.println(auto.patente+" "+auto.color+" "+auto.modelo+" "+auto.kilometros+" "+auto.conAire);


        // pero con el codigo anterior esto se muestra en la terminal
        /**
         * objeto.Auto@1b28cdfa
         * Gris
         * objeto.Auto@1b28cdfa
         * azul
         */
        // nada mas y nada menos por que estamos haciendo referencia al mismo objeto



    }
}