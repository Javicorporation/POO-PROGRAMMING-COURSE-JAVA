import java.util.Objects;

public class Ropa extends Producto{
    private String talla;
    private String material;

    public Ropa(int id, String nombre, double precio, String talla, String material) {
        super(id, nombre, precio);
        this.talla = talla;
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ropa ropa = (Ropa) o;
        return Objects.equals(talla, ropa.talla) && Objects.equals(material, ropa.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(talla, material);
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "talla='" + talla + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

