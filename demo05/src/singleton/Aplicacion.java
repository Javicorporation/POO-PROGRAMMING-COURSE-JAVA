package singleton;

public class Aplicacion {
    public static Aplicacion aplicacion01;
    public  boolean isRunning = false;


    private Aplicacion(){}

    public void Run(){
        //isRunning = true;
        if(!isRunning){
            System.out.println("Arrancando");
            isRunning = true;
        }else{
            System.out.println("Ya esta en compilacion");
        }
    }

    public static Aplicacion getInstance(){
        if (aplicacion01 == null) {
            aplicacion01 = new Aplicacion();
        }
        return aplicacion01;
    }
}