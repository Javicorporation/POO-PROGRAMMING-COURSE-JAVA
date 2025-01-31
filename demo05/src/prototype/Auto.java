package prototype;

public class Auto {

    public String marca;
    public String modelo;
    public int puerta;


    public Auto clonarAuto(){
        Auto clon = new Auto();

        clon.marca = marca;
        clon.modelo = modelo;
        clon.puerta = puerta;

        return clon;

    }
}
