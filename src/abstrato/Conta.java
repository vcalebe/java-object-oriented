package abstrato;

abstract class Conta {
    private double saldo;

    public void retira(double valor){
        this.saldo -= valor;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public abstract void att();
}
