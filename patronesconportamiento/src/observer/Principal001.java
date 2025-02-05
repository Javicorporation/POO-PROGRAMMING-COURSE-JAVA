package observer;

public class Principal001 {
    public static void main(String[] args) {
        //emisora
        Emisora emisora = new Emisora();


        // receptor
        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();


        // agregamos receptores
        emisora.meteReceptor(tv);
        emisora.meteReceptor(radio);
        emisora.meteReceptor(satelite);


        // emitimos
        emisora.emite();

    }
}
