package factory;

public class PrecioFactory {
    public Precio precio;

    private PrecioFactory(){};


    public PrecioFactory(String nombre){
        if (nombre.equalsIgnoreCase("España")){
            System.out.println("España, precio EUR");
            precio = new PrecioEUR();

        }else{
            System.out.println("USA, precio USD");
            precio = new PrecioUSD();

        }
    }
}
