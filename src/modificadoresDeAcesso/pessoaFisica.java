package modificadoresDeAcesso;

public class pessoaFisica {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;

    public boolean validaCPF(String cpf){
        if(cpf.length() != 11){
            System.out.println("Seu cpf nao pode ser alterado");
            return false;
        }else{
            System.out.println("Seu cpf pode ser alterado");
            return true;
        }
    }

    public void setCpf(String cpf) {
        validaCPF(cpf);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
