package adaptador;

public class Horno implements Enchufado{
     boolean encendido = false;


    @Override
    public void encendido() {
        encendido = true;
        System.out.println("el horno esta encendido");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("el horno esta apagado");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
