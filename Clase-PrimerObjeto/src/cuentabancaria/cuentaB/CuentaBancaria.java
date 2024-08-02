package cuentabancaria.cuentaB;

public class CuentaBancaria {

    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;

    // constructor
    public CuentaBancaria(String alias, double saldo) {
        this.CBU = generarCBU();
        setAlias(alias);
        this.saldo = saldo;
        setMoneda(moneda);
        setTipo(tipo);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String generarCBU(){
        return "r56rt3748";
    }

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
    public boolean saldoDisponible(double valor){
        return saldo >= valor;
    }
    public void retira(double valor){
        if (saldoDisponible(valor)){
            saldo -= valor;
        }else{
            System.out.println("Error");
        }
    }
}
