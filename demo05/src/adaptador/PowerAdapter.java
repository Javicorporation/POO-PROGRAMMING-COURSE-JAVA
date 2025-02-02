package adaptador;

public class PowerAdapter implements Enchufado{
    public Lightbuld lightbuld = new Lightbuld();


    @Override
    public void encendido() {
        lightbuld.turnOn(110);
    }

    @Override
    public void apagar() {
        lightbuld.turnOff();
    }

    @Override
    public boolean estaEncendido() {
        return lightbuld.isPoweredOn();
    }
}
