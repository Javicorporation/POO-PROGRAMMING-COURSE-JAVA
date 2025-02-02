package decorator;

public class Index {

    public static void main(String[] args) {
//        TelefonoBasico telefono = new TelefonoBasico();
//        telefono.crear();

        TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasico());
        ti.crear();
    }
}
