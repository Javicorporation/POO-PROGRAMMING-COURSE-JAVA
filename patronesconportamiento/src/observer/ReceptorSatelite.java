package observer;

public class ReceptorSatelite implements Receptor{
    @Override
    public void recibe() {
        System.out.println("recibe desde satelite");
    }
}
