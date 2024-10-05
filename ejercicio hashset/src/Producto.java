import java.util.Objects;

public class Producto implements Identificable{
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarInformacion(){
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id && Double.compare(precio, producto.precio) == 0 && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio);
    }


    @Override
    public String toString() {
        return
                "ID: " + id +
                "\nNombre: " + nombre +
                "\nPrecio: " + precio +"\n---------------------------";
    }
}
