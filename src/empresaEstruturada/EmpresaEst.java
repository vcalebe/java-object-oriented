package empresaEstruturada;

import array.empresaMultinacional.Empresa;
import array.empresaMultinacional.Funcionario;

public class EmpresaEst {
    private String nome;
    private String cnpj;
    private FuncionarioEst[] func;

    EmpresaEst(int quantFunc){
        this.func = new FuncionarioEst[quantFunc];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    void adiciona(FuncionarioEst f){
        for (int x = 0; x < func.length; x++){
            if (func[x] == null) {
                func[x] = f;
                break;
            }
        }
    }
}
