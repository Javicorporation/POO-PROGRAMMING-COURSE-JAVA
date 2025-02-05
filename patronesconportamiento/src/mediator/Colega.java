package mediator;

abstract public class Colega {

    public Mediator mediator;

    public Colega() {
        System.out.println("soy el constructor de la clase padre");
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void recibe();

    public abstract void envia();


}
