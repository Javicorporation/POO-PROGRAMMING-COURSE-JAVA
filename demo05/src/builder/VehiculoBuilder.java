package builder;

public class VehiculoBuilder {

    Vehiculo vehiculo;

    public VehiculoBuilder(String marca){
        vehiculo = new Vehiculo();
        vehiculo.setMarca(marca);
    }

    public VehiculoBuilder setPuertas(int puertas){
        vehiculo.setPuertas(puertas);
        return this;
    }

    public VehiculoBuilder setMotor(String motor){
        vehiculo.setMotor(motor);
        return this;
    }

    public Vehiculo build(){
        return this.vehiculo;
    }
}
