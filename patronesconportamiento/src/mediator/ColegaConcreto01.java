package mediator;

public class ColegaConcreto01 extends Colega {

    @Override
    public void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto01");
    }

    @Override
    public void envia() {
        System.out.println("soy ColegaConcreto01, envio un mensaje");
        mediator.reenvia(this);
    }
}
