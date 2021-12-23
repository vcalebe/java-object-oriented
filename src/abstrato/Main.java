package abstrato;

public class Main {
    public static void main(String[] args) {
        Conta[] contas = new Conta[2];
        contas[0] = new ContaPoupanca();
        contas[1] = new ContaCorrente();

        for (Conta conta : contas){
            conta.att();
        }
    }
}
