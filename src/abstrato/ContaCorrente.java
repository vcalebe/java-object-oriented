package abstrato;

public class ContaCorrente extends Conta{
    private double gastosEspeciais = 20.90;

    public void att(){
        super.retira(this.gastosEspeciais * 0.4);
        System.out.println(this.getSaldo());
    }
}
