package empresa;

public class Funcionario {
    String nome;
    String departamento;
    double salario;
    Data dataEntrada = new Data();
    String RG;
    boolean estadoEmpresa = true;

    void exibeInfo(){
        System.out.println("Nome = "+this.nome);
        System.out.println("Departamento = "+this.departamento);
        System.out.println("Salario = "+this.salario);
        System.out.println("Data de entrada = "+this.dataEntrada.consultaData());
        System.out.println("RG do func = "+this.RG);
        System.out.println("O funcionario esta na empresa ? = "+this.estadoEmpresa);
    }

    void bonifica(double quant){
        this.salario += quant;
        System.out.println(this.salario);
    }

    void demite(){
        this.estadoEmpresa = false;
    }
}
