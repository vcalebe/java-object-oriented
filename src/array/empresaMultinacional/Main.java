package array.empresaMultinacional;

public class Main {
    public static void main(String[] args) {
        Empresa lacta;
        lacta = new Empresa();
        lacta.nome = "lacta";
        lacta.cnpj = "4343";
        lacta.funcionarios = new Funcionario[5];


        Funcionario func1;
        func1 = new Funcionario();
        func1.nome = "joao";
        func1.cpf = "4444";

        Funcionario func2;
        func2 = new Funcionario();
        func2.nome = "pedro";
        func2.cpf = "4443";

        lacta.adiciona(func1);
        lacta.adiciona(func2);

        System.out.println(lacta.funcionarios[0].cpf);
        System.out.println(lacta.funcionarios[1].nome);

        lacta.procuraFunc(func1);


    }


}
