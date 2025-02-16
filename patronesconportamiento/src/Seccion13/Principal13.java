package Seccion13;

import java.util.Arrays;

public class Principal13 {
    public static void main(String[] args) throws UserException {

        Usuarios usuarios = new Usuarios();

        Usuario usuario = new Usuario();

        usuario.nombre="Juanin";
        usuario.apellido = "Paes";
        usuario.edad = 23;

        usuarios.anadirUsuario(usuario);

        try {
            usuarios.anadirUsuario(usuario);
            usuarios.anadirUsuario(usuario);
        }catch (UserException e){
            System.out.println("Error al añador Usuario "+e.getMessage());
        }








//        //boolean mayor = 4 > 2 ? true:false;
//        //a();
//
////        int []iNumeros = {1,2,7,97,4,72,43};
////        int resultado = sumarNumeros(iNumeros);
////        System.out.println(resultado);
//        int resultadox = sumaInfinita(2,5,3,4,7,4,4);
//        System.out.println(" -- resultado = " + resultadox);
    }

    //funcion monoada
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

    // funcion biadica
    public static int sumar2Valores(int valorA, int valorB) {
        return valorA + valorB;
    }


    // funcion triadica
    public static int sumar3Valores(int valorA, int valorB, int valorC) {
        return valorA + valorB + valorC;
    }


    // funcion poliadica
    public static int sumarNValores(int valorA, int valorB, int valorC, int valorD) {
        return valorA + valorB + valorC;
    }



    public static int sumaInfinita(int ...numeros){

        int resultado = 0;
        for (int numero : numeros){
            resultado += numero;
        }
        return resultado;
    }


    //funcion
    public static boolean esLaborable(int dia){
        return true;
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
