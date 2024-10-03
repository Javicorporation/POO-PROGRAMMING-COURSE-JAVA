package ejercicio1;

import ejercicio1.clases.Coche;
import ejercicio1.clases.Moto;
import ejercicio1.clases.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class ejemplo1 {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Coche("Chevrolet", "HJDSDH"));
        vehiculos.add(new Coche("Mazda", "HJDSDH"));
        vehiculos.add(new Coche("KIA", "HJDSDH"));
        vehiculos.add(new Moto("Suzuki", "URJJTR"));
        vehiculos.add(new Moto("Yamaha", "URJJTR"));
        vehiculos.add(new Moto("Suzuki", "URJJTR"));

        vehiculos.forEach(v -> v.mostrarInformacion());
    }
}
