package mediator;

public class ColegaConcreto02 extends Colega {

    public ColegaConcreto02() {
        System.out.println("soy constructor de ColegaConcreto02");
    }

    @Override
    public void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto02");
    }

    @Override
    public void envia() {
        System.out.println("soy ColegaConcreto02, envio un mensaje");
        mediator.reenvia(this);
    }
}
