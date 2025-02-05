package observer;

import java.util.ArrayList;

public class Emisora {

    //creamos una lista interna de receptores
    private ArrayList<Receptor> receptors = new ArrayList<>();

    // agregamos un receptor a la lista
    public void meteReceptor(Receptor receptor){
        this.receptors.add(receptor);
    }

    // en recorre la lista y ejecuta el metodo
    public void emite(){
        for (Receptor receptor : receptors) {
            receptor.recibe();
        }
    }

}
