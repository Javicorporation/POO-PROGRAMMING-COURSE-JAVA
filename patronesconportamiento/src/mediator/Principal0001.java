package mediator;

public class Principal0001 {
    public static void main(String[] args) {

        Mediator mediador = new MediatorConcreto();

        Colega colega1 = new ColegaConcreto01();
        Colega colega2 = new ColegaConcreto02();
        Colega colega3 = new ColegaConcreto03();

        mediador.registra(colega1);
        mediador.registra(colega2);
        mediador.registra(colega3);

        System.out.println("-----------------");
        colega1.envia();
        System.out.println("-----------------");
        colega2.envia();
        System.out.println("-----------------");
        colega3.envia();
    }
}
