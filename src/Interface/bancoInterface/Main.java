package Interface.bancoInterface;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        contaCorrente.depositar(500);
        seguroDeVida.depositar(500);

        GerenciadorImportRenda gerenciadorImportRenda = new GerenciadorImportRenda(2);

        gerenciadorImportRenda.add(contaCorrente);
        gerenciadorImportRenda.add(seguroDeVida);
    }
}
