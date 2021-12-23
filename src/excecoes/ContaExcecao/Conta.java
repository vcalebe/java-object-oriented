package excecoes.ContaExcecao;

public class Conta {
    private double saldo;

    void depositar(double x){
        this.saldo = this.saldo + x;
        System.out.println(getSaldo());
    }

    public void sacar(double x){
        try{
            if (x > this.saldo){
                throw new SaldoInsufiException("Saldo insuficiente");
            }else{
                this.saldo-=x;
            }
        }catch (SaldoInsufiException erro){
            System.out.println(erro.getMsg());
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
