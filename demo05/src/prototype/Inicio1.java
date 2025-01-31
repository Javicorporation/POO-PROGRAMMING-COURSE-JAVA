package prototype;

public class Inicio1 {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.marca ="Mustan";
        auto.modelo ="RTI89";
        auto.puerta =5;

        System.out.println(auto.marca+"  "+auto.modelo+"  "+auto.puerta);


        try {
            Auto clonado = auto.clonar();
            clonado.puerta = 4;
            System.out.println(clonado.marca+"  "+clonado.modelo+"  "+clonado.puerta);
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
