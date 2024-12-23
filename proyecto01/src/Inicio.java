import java.util.ArrayList;
import java.util.function.Function;

public class Inicio {

//    // diferencia de un stream y de forma normal
//
//    // funcion inicializada como una variable, es un stream
//    private Function<String, String> toMayus = x -> x.toUpperCase();
//
//    private Function<Integer, Integer> valInt = x -> x + 5;
//
    // asi seria de forma normal
    public static String toMayuss(String x) {
        return x.toUpperCase();
    }

//    public void pruebas(){
//        toMayus.apply("juanin");
//        valInt.apply(5);
//
//    }

    public static void main(String[] args) {
        Funcionales f = new Funcionales();
        f.pruebas();
    }




//    public static int contador;
//    public static void main(String[] args) {
//        int result = suma(1,2);
//        int result2 = suma(1,2);
//        System.out.println(result +" ,    "+result2);
//        System.out.println(contador);
//    }
//
//
//    // ejemplo de funcion pura, solo puede hacer algo especifico
//    // no debe hacer mas de lo que debe
//    // no puede tener acciones colaterales
//    public static int suma (int a, int b) {
//        //contador++;
//        return a + b;
//    }
//
//
//    public static void cadena(String cadena){
//        return cadena.startsWith("a");
//    }
}
