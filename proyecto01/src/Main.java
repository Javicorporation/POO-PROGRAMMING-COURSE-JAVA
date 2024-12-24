public class Main {
    public static void main(String[] args) {
        System.out.println(suma(5));
        System.out.println(sumaRecursiva(5));

    }


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
}
