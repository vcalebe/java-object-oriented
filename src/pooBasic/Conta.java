package pooBasic;

public class Conta {
    int numero;
    Cliente dono;
    double saldo;
    double limite;

    void imprimeBanco(){
        System.out.println("Este cliente e do banco farofa");
    }

    void sacar(double quant){
        if (debitoSacar(quant)){
            double novoSaldo = this.saldo - quant;
            this.saldo = novoSaldo;
        }
    }

    void depositar(double quant){
        this.saldo += quant;
    }

    boolean debitoSacar(double quant){
        if (this.saldo < quant){
            System.out.println("Nao tem saldo suficiente");
            return false;
        }else {
            System.out.println("Sucesso");
            return true;
        }
    }

    boolean trasfere(Conta conta, double quant){
        if (debitoSacar(quant)){
            double novoSaldo = this.saldo - quant;
            this.saldo = novoSaldo;

            conta.depositar(quant);
            System.out.println("Sucesso");
            return true;
        }else{
            System.out.println("Falha");
            return false;
        }
    }
}
