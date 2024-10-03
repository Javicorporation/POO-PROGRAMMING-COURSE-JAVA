package ejercicio1.clases;

public class Coche extends Vehiculo implements Conducible{


    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void arrancar() {
        System.out.println("El coche " + getMarca() + " " + getModelo() + " está arrancando.");
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo el coche " + getMarca() + " " + getModelo());
    }
}
