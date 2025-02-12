package Seccion13;

import java.util.Arrays;

public class Principal13 {
    public static void main(String[] args) {

        //boolean mayor = 4 > 2 ? true:false;
        //a();

        int []iNumeros = {1,2,7,97,4,72,43};
        int resultado = sumarNumeros(iNumeros);
        System.out.println(resultado);
    }

    public static int sumarNumeros(int[] numeros) {
//        int resultado = 0;
//
//        for (int numero : numeros) {
//            resultado += numero;
//        }
//        return resultado;

        int resultado = Arrays.stream(numeros).reduce(0, (a,b) -> a+b);
        return resultado;
    }

//    public static void a(){
//        b();
//    }
//
//    public static void b(){
//        c();
//    }
//
//    public static void c(){
//        d();
//    }
//
//    public static void d(){
//        e();
//    }
//
//    public static void e(){
//        System.out.println("Estoy en la funcion e");
//    }

//    public static void demoSwitch(){
//        String sFruta = "Manzana";
//
//        if (sFruta == "Pera") {
//            System.out.println("Es una perra");
//        } else if (sFruta == "Melon") {
//            System.out.println("Es un melon");
//        } else if (sFruta == "Banana"){
//            System.out.println("Es una banana");
//        }else {
//            System.out.println("Es otra fruta");
//        }
//
//
//        switch (sFruta){
//            case "Pera":
//                System.out.println("Es una perra");
//                break;
//            case "Melon":
//                System.out.println("Es un melon");
//                break;
//            case "Banana":
//                System.out.println("Es una banana");
//                break;
//            default:
//                System.out.println("Es otra fruta");
//        }
//    }

}
