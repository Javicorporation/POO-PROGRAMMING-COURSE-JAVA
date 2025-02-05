package mediator;

import java.util.ArrayList;

public class MediatorConcreto extends Mediator {

    // creamos lista
    ArrayList<Colega> colegas = new ArrayList();


    @Override
    void registra(Colega colega) {
        if (!colegas.contains(colega)) {
            colegas.add(colega);
            colega.setMediator(this);
        }
    }


    @Override
    void reenvia(Colega colega) {
        for (Colega actual : colegas) {
            if(!actual.equals(colega)) {
                actual.recibe();
            }
        }
    }


}
