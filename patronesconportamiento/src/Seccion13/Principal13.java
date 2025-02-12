package Seccion13;

public class Principal13 {
    public static void main(String[] args) {

        //boolean mayor = 4 > 2 ? true:false;
        a();
    }

    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        d();
    }

    public static void d(){
        e();
    }

    public static void e(){
        System.out.println("Estoy en la funcion e");
    }

    public static void demoSwitch(){
        String sFruta = "Manzana";

        if (sFruta == "Pera") {
            System.out.println("Es una perra");
        } else if (sFruta == "Melon") {
            System.out.println("Es un melon");
        } else if (sFruta == "Banana"){
            System.out.println("Es una banana");
        }else {
            System.out.println("Es otra fruta");
        }


        switch (sFruta){
            case "Pera":
                System.out.println("Es una perra");
                break;
            case "Melon":
                System.out.println("Es un melon");
                break;
            case "Banana":
                System.out.println("Es una banana");
                break;
            default:
                System.out.println("Es otra fruta");
        }
    }

}
