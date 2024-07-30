package cuentabancaria.cuentaB;

public class CuentaBancaria {

    String CBU;
    String alias;
    double saldo;

    public void mostrarDatos(){
        System.out.println(CBU+" - "+alias+" - "+saldo);
    }

    public double mostrarSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        }else {
            System.out.println("Error");
        }
    }
}
