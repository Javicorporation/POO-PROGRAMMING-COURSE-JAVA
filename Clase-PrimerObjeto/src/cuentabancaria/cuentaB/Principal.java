package cuentabancaria.cuentaB;

public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria("54656h","dolar","efectivo");
        CuentaBancaria cb2 = new CuentaBancaria();
        CuentaBancaria cb3 = new CuentaBancaria("pesos","efectivo");
        cb1.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();






    }
}
