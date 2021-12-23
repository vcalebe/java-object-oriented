package pooBasic;

public class Programa {
    public static void main(String[] args) {
        //primeita conta e cliente
        Cliente firstClient;
        firstClient = new Cliente();
        firstClient.nome = "vampeta";
        firstClient.cpf = "500.500.500.55";
        firstClient.trabalho = "jogador";

        Conta firstAcont;
        firstAcont = new Conta();
        firstAcont.dono = firstClient;
        firstAcont.saldo = 1000.0;
        firstAcont.limite = 3000.0;

        //segunda conta e cliente
        Cliente secundClient;
        secundClient = new Cliente();
        secundClient.nome = "romario";
        secundClient.cpf = "500.440.500.55";
        firstClient.trabalho = "jogador";

        Conta secundAcont;
        secundAcont = new Conta();
        secundAcont.dono = secundClient;


        //transferencia entre contas
        System.out.println(firstAcont.saldo);
        System.out.println(secundAcont.saldo);

        firstAcont.trasfere(secundAcont,300);

        System.out.println(firstAcont.saldo);
        System.out.println(secundAcont.saldo);


    }
}
