package decorator;

public class Index {

    public static void main(String[] args) {
//        TelefonoBasico telefono = new TelefonoBasico();
//        telefono.crear();

        TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasico());
        ti.crear();

        System.out.println("-------------");
        TelefonoNextGen tng = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
        tng.crear();
    }
}
