package adaptador;

public class Index01 {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter lightbuld = new PowerAdapter();

        enciende(horno);
        enciende(lampara);
        enciende(lightbuld);

        System.out.println(estaEncendido(horno));
        System.out.println(estaEncendido(lampara));
        System.out.println(estaEncendido(lightbuld));

    }

    public static void enciende (Enchufado enchufado){
        enchufado.encendido();
    }

    public static void apaga(Enchufado enchufado){
        enchufado.apagar();
    }


    public static boolean estaEncendido(Enchufado enchufado){
        return enchufado.estaEncendido();
    }
}
