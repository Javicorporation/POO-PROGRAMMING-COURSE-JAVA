import java.util.function.Function;

public class Funcionales {

    // diferencia de un stream y de forma normal

    // funcion inicializada como una variable, es un stream
    // esto es funcional
    private Function<String, String> toMayus = x -> x.toUpperCase();

    private Function<Integer, Integer> valInt = x -> x + 5;

    // asi seria de forma normal
    // de forma inperactiva
//    public static String toMayuss(String x) {
//        return x.toUpperCase();
//    }

    public void pruebas(){
        toMayus.apply("juanin");
        valInt.apply(5);
        saludar(toMayus,"hola");

    }

    // esta es una funcion normal que acepta como parametro otra funcion y
    // esta acepta un atributo de tipo string
    public void saludar(Function<String, String> miFuncion, String nombre){
        miFuncion.apply(nombre);

    }


}
