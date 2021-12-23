package abstrato;

public class ContaPoupanca extends Conta{
    public double correcao;

    public void att(){
        super.deposita(this.getSaldo() * this.correcao);
        System.out.println(this.getSaldo());
    }
}
