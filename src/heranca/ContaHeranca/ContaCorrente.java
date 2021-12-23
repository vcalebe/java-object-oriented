package heranca.ContaHeranca;

public class ContaCorrente extends Conta {
    void atualiza(double Selic){
        Selic = Selic*2;
        super.atualiza(Selic);
        super.sacar(15);
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }
}
