import java.util.stream.IntStream;

public class Principal {
    public static void main(String[] args) {
        //System.out.println(sumaSerie(5));
//        funcionCola(5);
//        funcionCabeza(5);
//        System.out.println(sumaSerie(5));
//        System.out.println(sumaFuncionalRec(5));
//        System.out.println(sumaRecursival(5));

        System.out.println(factorial(5));
        System.out.println(factorialRecursival(5));
        System.out.println(factorialFuncional(5));

    }
    // suma de una seria de numero por medio de una funcion iterativa
    public static int sumaSerie(int numero){
        int resultado = 0;

        for (int i = 0; i <= numero; i++) {
            resultado +=i;
        }
        return resultado;
    }

    public static int sumaFuncionalRec(int numero){
        return IntStream.rangeClosed(1,5)
                .reduce(0, (a, b) -> a + b);
    }

    public static int sumaRecursival(int numero){
        if (numero == 1){
            return 1;
        }
        return numero + sumaRecursival(numero - 1);
    }

    // factorial
    public static int factorial(int numero){
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado*i;
        }
        return resultado;
    }


    // factorial
    public static int factorialRecursival(int numero){
        if (numero == 0){
            return 1;
        }
        return numero * factorialRecursival(numero - 1);
    }

    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1, numero)
                .reduce(1, (a, b) -> a*b);
    }


    // factorial


    //funcion recursiva por cabeza
//    public static void funcionCabeza(int valor){
//        if (valor == 0){
//            return;
//        }
//        funcionCabeza(valor-1);
//        System.out.println(valor);
//    }

    //funcion recursiva por cola

//    public static void funcionCola(int valor){
//        if (valor == 0){
//            return;
//        }
//        System.out.println(valor);
//        funcionCola(valor-1);
//    }

}
