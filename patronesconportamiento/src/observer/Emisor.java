package observer;

import java.util.ArrayList;
import java.util.Observer;

public class Emisor {

    private ArrayList<Receptor> receptors = new ArrayList<>();

    public void meteReceptor(Receptor receptor){
        this.receptors.add(receptor);
    }

    public void emite(){
        for (Receptor receptor : receptors) {
            receptor.recibe();

        }
    }

}
