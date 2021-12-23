package Interface.bancoInterface;

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributos(double taxa) {
        double temp = (taxa*0.1) * this.getSaldo();
        return temp;
    }
}
