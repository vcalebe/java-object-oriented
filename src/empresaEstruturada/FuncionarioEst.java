package empresaEstruturada;

public class FuncionarioEst {
    private static int totalFunc;
    private String nome;
    private int id;

    FuncionarioEst(){
        this.id = FuncionarioEst.totalFunc +=1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

}

