package heranca;

public class Main {
    public static void main(String[] args) {
        Gerente ger1 = new Gerente();
        Funcionario fun1 = new Funcionario();

        ger1.setSalario(1000);
        fun1.setSalario(1000);

        System.out.println(ger1.getBonificacao());
        System.out.println(fun1.getBonificacao());
    }
}
