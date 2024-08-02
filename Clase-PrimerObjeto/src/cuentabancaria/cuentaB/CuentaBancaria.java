package cuentabancaria.cuentaB;

public class CuentaBancaria {

    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;

    // constructor
    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CBU = generarCBU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }

    public CuentaBancaria() {
    }

    public CuentaBancaria(String moneda, String tipo) {
        this("jujujuju",moneda, tipo);
        // para evitar volver a escribir podemos sobrecargar metodos con this()

        // tiene se repiten datos similares
//        this.CBU = generarCBU();
//        this.alias = "fhjfhdj";
//        this.moneda = moneda;
//        this.tipo = tipo;
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
        return "jajajajaj";
    }

    public void mostrarDatos(){
        System.out.println(CBU+" - "+alias+" - "+saldo+" - "+moneda);
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
