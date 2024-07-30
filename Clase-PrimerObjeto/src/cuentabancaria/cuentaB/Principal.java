package cuentabancaria.cuentaB;

public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cuentaBanc = new CuentaBancaria();
        cuentaBanc.mostrarDatos();
        cuentaBanc.CBU = "fdhfj";
        cuentaBanc.alias = "sjfhjd";
        cuentaBanc.mostrarDatos();

        System.out.println("el saldo es: "+cuentaBanc.mostrarSaldo());
        cuentaBanc.depositar(100);
        System.out.println("el saldo es: "+cuentaBanc.mostrarSaldo());


    }
}
