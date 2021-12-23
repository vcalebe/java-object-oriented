package excecoes.ContaExcecao;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        AttConta att = new AttConta(1.5);

        contaCorrente.depositar(770);
        contaPoupanca.depositar(500);
        conta.depositar(200);

        conta.atualiza(100);
        contaCorrente.atualiza(100);
        contaPoupanca.atualiza(100);

        att.process(conta);
        att.process(contaCorrente);
        att.process(contaPoupanca);

        conta.sacar(60300);
        System.out.println(conta.getSaldo());

    }
}
