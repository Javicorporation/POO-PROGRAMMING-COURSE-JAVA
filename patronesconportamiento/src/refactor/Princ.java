package refactor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Princ {
    public static void main(String[] args) {
        int []numeros = {222,45,65,43,16,11};

        inprimeMayorYMenor3(numeros);
    }

    // codigo normal
    private static void inprimeMayorYMenor(int[] numeros) {
        int mayor = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }
            if (menor > numeros[i]) {
                menor = numeros[i];
            }
        }
        System.out.println("mayor: " + mayor+"\nmenor: " + menor);
    }


    // codigo refactoriado
    private static void inprimeMayorYMenor1(int[] numeros) {
        int mayor = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            mayor = mayor < numeros[i] ? numeros[i] : mayor;
            menor = menor > numeros[i] ? numeros[i] : menor;
        }
        System.out.println("mayor: " + mayor+"\nmenor: " + menor);
    }

    // codigo aun mas refactoriado

    private static void inprimeMayorYMenor2(int[] numeros) {
        int mayor = 0;
        int menor = numeros[0];

        for (int i : numeros) {
            mayor = mayor < i ? i : mayor;
            menor = menor > i ? i : menor;
        }
        System.out.println("mayor: " + mayor+"\nmenor: " + menor);
    }

    // codigo aun mas refactoriado

    private static void inprimeMayorYMenor3(int[] numeros) {
        int mayor = Arrays.stream(numeros).reduce(numeros[0], (a,b) -> a > b ? a : b);
        int menor = Arrays.stream(numeros).reduce(numeros[0], (a,b) -> a < b ? a :b);

        System.out.println("mayor: " + mayor+"\nmenor: " + menor);
    }
}
