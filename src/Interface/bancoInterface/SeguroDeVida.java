package Interface.bancoInterface;

public class SeguroDeVida extends Conta implements Tributavel{
    @Override
    public double calculaTributos(double taxa) {
        double temp = (taxa*this.getSaldo()) + 10;
        return temp;
    }
}
