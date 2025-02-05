package observer;

public class ReceptorTV implements Receptor {
    @Override
    public void recibe() {
        System.out.println("se recibe desde tv");
    }
}
