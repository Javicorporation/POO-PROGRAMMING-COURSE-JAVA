import java.security.Principal;
import java.util.Random;

public class Pin {

//    final String name = "sdfg";
//
//
//    // bloque de codigo
//    {
//        address = "holaaa";
//    }
//
//    String address ="";
//    public static void main(String[] args) {
//        principal p = new principal() ;
//        //p.name = "ssssssss";
//        System.out.println(p.address);
//
//    }
    {
        System.out.println("Step 1");
    }
    static {
        System.out.println("Step 2");
    }
    public static void main(String[] args) {
        new Pin();
    }

    public void mostrar() {
        {
            int x = 10;
            System.out.println("Valor de x: " + x);
        }
        {
            int y = 20;
            System.out.println("Valor de y: " + y);
        }
    }

}
