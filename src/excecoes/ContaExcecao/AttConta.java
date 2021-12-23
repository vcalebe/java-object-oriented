package excecoes.ContaExcecao;

public class AttConta {
    private double saldoTotal = 0;
    private double selic;

    AttConta(double selic){
        this.selic = selic;
    }

    public void process(Conta conta){
        System.out.println("Saldo anterior "+conta.getSaldo());
        conta.atualiza(this.selic);
        System.out.println("Saldo atual "+conta.getSaldo());
    }
}
