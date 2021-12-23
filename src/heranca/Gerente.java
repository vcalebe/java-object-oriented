package heranca;

public class Gerente extends Funcionario {
    private int senha;

    public double getBonificacao(){
        return this.salario * 0.15;
    }
}
