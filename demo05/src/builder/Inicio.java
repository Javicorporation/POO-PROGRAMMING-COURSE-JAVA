package builder;

import java.util.stream.IntStream;

public class Inicio {
    public static void main(String[] args) {


        Vehiculo auto = new VehiculoBuilder("Mustan")
                .setPuertas(5).setMotor("gasolina")
                .build();


//        vehiculo.setMarca("Ford");
//        vehiculo.setMotor("diesel");
//        vehiculo.setTipo("conbustible");
//        vehiculo.setPuertas(5);



        System.out.println("Marca: "+auto.getMarca());
        System.out.println("Puertas: "+auto.getPuertas());
        System.out.println("Motor: "+auto.getMotor());
    }
}
