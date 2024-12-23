public class Inicio {
    public static int contador;
    public static void main(String[] args) {
        int result = suma(1,2);
        int result2 = suma(1,2);
        System.out.println(result +" ,    "+result2);
        System.out.println(contador);
    }


    // ejemplo de funcion pura
    public static int suma (int a, int b) {
        //contador++;
        return a + b;
    }
}
