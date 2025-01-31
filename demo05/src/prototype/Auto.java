package prototype;

public class Auto implements Cloneable {

    public String marca;
    public String modelo;
    public int puerta;


//    public Auto clonarAuto(){
//        Auto clon = new Auto();
//
//        clon.marca = marca;
//        clon.modelo = modelo;
//        clon.puerta = puerta;
//
//        return clon;
//
//    }

    public Auto(){}

    public Auto clonar() throws CloneNotSupportedException{
        return (Auto)this.clone();
    }
}
