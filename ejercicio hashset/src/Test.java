import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Producto> listaProductos = new HashSet<>();
        listaProductos.add(new Electrodomestico(121, "Tele", 200, "Oster", 110));
        listaProductos.add(new Electrodomestico(122, "Tele", 200, "Oster", 120));
        listaProductos.add(new Electrodomestico(121, "Tele", 200, "Oster", 110));

        listaProductos.forEach(v -> System.out.println(v));
    }


}
