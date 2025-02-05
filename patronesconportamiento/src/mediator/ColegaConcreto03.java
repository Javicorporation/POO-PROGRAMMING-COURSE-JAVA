package mediator;

public class ColegaConcreto03 extends Colega {

    @Override
    public void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto03");
    }

    @Override
    public void envia() {
        System.out.println("soy ColegaConcreto03, envio un mensaje");
        mediator.reenvia(this);
    }
}
