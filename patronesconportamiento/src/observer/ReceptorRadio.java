package observer;

public class ReceptorRadio implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Se recibe desde la radio");
    }
}
