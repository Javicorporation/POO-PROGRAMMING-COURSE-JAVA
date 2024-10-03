package ejercicio1.clases;

public class Moto extends Vehiculo implements Conducible{
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void arrancar() {

        System.out.println("Arrancando la Moto marca: "+ this.getMarca()+" de modelo: "+ this.getModelo());

    }

    @Override
    public void conducir() {
        System.out.println("conduciendo la Moto marca: "+ this.getMarca()+" de modelo: "+ this.getModelo());
    }
}
