package factory;

public class PrecioFactory {
    public Precio precio;

    private PrecioFactory(){};


    public PrecioFactory(String nombre){
        if (nombre.equalsIgnoreCase("España")){
            System.out.println("España, precio EUR");
            precio = new PrecioEUR();

        } else if (nombre.equalsIgnoreCase("UK")) {
            System.out.println("UK, precio UK");
            precio = new PrecioGBP();

        } else{
            System.out.println("USA, precio USD");
            precio = new PrecioUSD();

        }
    }
}
