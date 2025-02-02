package adaptador;

public class Lampara implements Enchufado{

    boolean encendido = false;


    @Override
    public void encendido() {
        encendido = true;
        System.out.println("la lampara esta encendida");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("la lampara esta apagada");

    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
