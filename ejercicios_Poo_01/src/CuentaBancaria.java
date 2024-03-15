public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
    //metodos
    public String getTitular() {
        return this.titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void ingresarDinero(double cantidad){
        this.saldo+=cantidad;
    }
    public void retirarDinero(double cantidad){
        this.saldo-=cantidad;
    }
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
