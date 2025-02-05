package mediator;

abstract public class Colega {

    Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void recibe();

    public abstract void envia();


}
