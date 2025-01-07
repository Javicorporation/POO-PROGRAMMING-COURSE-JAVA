public class Index {

    public static void main(String[] args) {
        //System.out.println(suma(5));
        //System.out.println(sumaRecursiva(5));
        //tailRecursion(5);
        headRecursion(5);

    }


    // recursividad de cola
    public static void tailRecursion(int valor) {
        if (valor == 0) {
            return;
        }
        //System.out.println(valor);
        tailRecursion(valor - 1);
    }

    // recursividad de cabeza
    public static void headRecursion(int valor) {
        if (valor == 0) {
            return;
        }
        headRecursion(valor - 1);
        System.out.println(valor);
    }}





// de la forma normal
public static int suma(int max){
    int sum = 0;
    for (int i = 1; i <= max; i++) {
        sum = sum + i;
    }
    return sum;
}

// de manera recursiva
public static int sumaRecursiva(int max){
    // de esta forma causamos un desborde de pila
    //return max+sumaRecursiva(max - 1);

    if (max == 1){
        return 1;
    }

    return max+sumaRecursiva(max - 1);
}


