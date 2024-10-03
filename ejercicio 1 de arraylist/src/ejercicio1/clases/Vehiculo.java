package ejercicio1.clases;

public abstract class  Vehiculo {

    private String  marca;
    private String  modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void arrancar();


    public void mostrarInformacion(){
        System.out.println("Marca: " + marca+",  Modelo: " + modelo);
    }
}
