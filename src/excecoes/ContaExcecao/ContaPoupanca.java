package excecoes.ContaExcecao;

public class ContaPoupanca extends Conta {
    @Override
    void atualiza(double Selic) {
        Selic = Selic*0.75;
        super.atualiza(Selic);
    }
}
