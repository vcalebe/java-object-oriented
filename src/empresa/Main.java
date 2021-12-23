package empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario func1;
        func1 = new Funcionario();
        func1.nome = "Pedro";
        func1.departamento = "vendas";
        func1.RG = "555555";
        func1.salario = 500;
        func1.dataEntrada.insereData("17","07", "2001");

        func1.exibeInfo();
    }
}
