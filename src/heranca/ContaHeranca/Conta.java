package heranca.ContaHeranca;

public class Conta {
    private double saldo;

    void depositar(double x){
        this.saldo = this.saldo + x;
        System.out.println(getSaldo());
    }

    public boolean sacar(double x){
        if (x > this.saldo){
            return false;
        }else{
            this.saldo-=x;
            return true;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    void atualiza(double Selic){
        this.saldo = this.saldo*(1+Selic);
        System.out.println(this.getSaldo());
    }
}
