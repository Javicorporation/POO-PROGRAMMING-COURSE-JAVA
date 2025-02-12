package refactor;

import java.util.Vector;

public class Princ {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector(4096);

    }


































//    public boolean esWindowsJavaEnJava(){
//        if (System.getProperty("java.runtime.mane").contains("Oracle")
//                && System.getProperty("os.version").compareTo("11.6")==0) {
//
//        }
//    }

//        int []numeros = {222,45,65,43,16,11};
//        inprimeMayorYMenor3(numeros);

        //ConstructorLargo constructorLargo = new ConstructorLargo();
//        ConstructorLargoBuilder cosa = new ConstructorLargoBuilder("fghjkl")
//                .conModelo("bmw")
//                .conMotor("fgh")
//                .conPuertas(5);
    //}


//    public boolean hoyEsDomingo(int numero){
//        boolean isDomingo = (numero == 7 ? true : false);
//        if (isDomingo){
//            System.out.println(isDomingo);
//        }
//        return isDomingo;
    }

//    public static boolean isDomingo (int numero){
//        if(numero == 7){
//            return true;
//        }
//        return false;
//    }















//    // codigo normal
//    private static void inprimeMayorYMenor(int[] numeros) {
//        int mayor = 0;
//        int menor = numeros[0];
//
//        for (int i = 0; i < numeros.length; i++) {
//            if (mayor < numeros[i]) {
//                mayor = numeros[i];
//            }
//            if (menor > numeros[i]) {
//                menor = numeros[i];
//            }
//        }
//        System.out.println("mayor: " + mayor+"\nmenor: " + menor);
//    }
//
//
//    // codigo refactoriado
//    private static void inprimeMayorYMenor1(int[] numeros) {
//        int mayor = 0;
//        int menor = numeros[0];
//
//        for (int i = 0; i < numeros.length; i++) {
//            mayor = mayor < numeros[i] ? numeros[i] : mayor;
//            menor = menor > numeros[i] ? numeros[i] : menor;
//        }
//        System.out.println("mayor: " + mayor+"\nmenor: " + menor);
//    }
//
//    // codigo aun mas refactoriado
//
//    private static void inprimeMayorYMenor2(int[] numeros) {
//        int mayor = 0;
//        int menor = numeros[0];
//
//        for (int i : numeros) {
//            mayor = mayor < i ? i : mayor;
//            menor = menor > i ? i : menor;
//        }
//        System.out.println("mayor: " + mayor+"\nmenor: " + menor);
//    }
//
//    // codigo aun mas refactoriado
//
//    private static void inprimeMayorYMenor3(int[] numeros) {
//        int mayor = Arrays.stream(numeros).reduce(numeros[0], (a,b) -> a > b ? a : b);
//        int menor = Arrays.stream(numeros).reduce(numeros[0], (a,b) -> a < b ? a :b);
//
//        System.out.println("mayor: " + mayor+"\nmenor: " + menor);
//    }
//
//
//
//    public static int ifanidado(){
//        int valor1 = 10;
//        int valor2 = 10;
//
//        if (valor1 > valor2 ) {
//            return valor1;
//        }//else {
//            //return valor2;
//        //}
//        return valor2;
//    }
//}
