package refactor;

public class ConstructorLargoBuilder {
    String marca;
    String modelo;
    String motor;
    int puertas;


    public ConstructorLargoBuilder() {}

    public ConstructorLargoBuilder (String marca){
        this.marca=marca;

    }


    public ConstructorLargoBuilder conModelo (String modelo){
        this.modelo=modelo;
        return this;
    }

    public ConstructorLargoBuilder conMotor (String motor) {
        this.motor = motor;
        return this;
    }

    public ConstructorLargoBuilder conPuertas(int puertas) {
        this.puertas = puertas;
        return this;
    }

}
