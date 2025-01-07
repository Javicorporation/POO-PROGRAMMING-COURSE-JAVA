public class Principal {
    public static void main(String[] args) {
        //System.out.println(sumaSerie(5));
        funcionCola(5);
        funcionCabeza(5);

    }
    // suma de una seria de numero por medio de una funcion iterativa
    public static int sumaSerie(int numero){
        int resultado = 0;

        for (int i = 0; i <= numero; i++) {
            resultado +=i;
        }
        return resultado;
    }

    //funcion recursiva por cabeza
    public static void funcionCabeza(int valor){
        if (valor == 0){
            return;
        }
        funcionCabeza(valor-1);
        System.out.println(valor);
    }

    //funcion recursiva por cola

    public static void funcionCola(int valor){
        if (valor == 0){
            return;
        }
        System.out.println(valor);
        funcionCola(valor-1);
    }

}
