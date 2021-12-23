package array.empresaMultinacional;

public class Empresa {
    String cnpj;
    String nome;
    Funcionario[] funcionarios;

    void adiciona(Funcionario f){
        for (int x = 0; x < funcionarios.length; x++){
            if (funcionarios[x] == null) {
                funcionarios[x] = f;
                break;
            }
        }
    }

    void procuraFunc(Funcionario f){
        for (int x = 0; x < funcionarios.length; x++){
            if (funcionarios[x].nome == f.nome) {
                System.out.println("contem");
                break;
            }
        }
    }
}
