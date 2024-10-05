import java.util.Objects;

public class Electrodomestico extends Producto{
    private String marca;
    private int consumoEnergia;

    public Electrodomestico(int id, String nombre, double precio, String marca, int consumoEnergia) {
        super(id, nombre, precio);
        this.marca = marca;
        this.consumoEnergia = consumoEnergia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electrodomestico that = (Electrodomestico) o;
        return consumoEnergia == that.consumoEnergia && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, consumoEnergia);
    }


}
