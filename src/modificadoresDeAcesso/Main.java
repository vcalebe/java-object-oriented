package modificadoresDeAcesso;

public class Main {
    public static void main(String[] args) {
        pessoaFisica victor = new pessoaFisica();

        victor.setCpf("50322722733");
        System.out.println(victor.getCpf());

    }
}
