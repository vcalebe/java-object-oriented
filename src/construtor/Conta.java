package construtor;

public class Conta {
    private static int totalConstas;
    private int numero;
    private String dono;
    private double saldo;
    private double limite;

    Conta(String dono){
        this.dono = dono;
        System.out.println("Conta construida para "+this.dono);

        Conta.totalConstas +=1;
    }

    public static int getTotalConstas() {
        return Conta.totalConstas;
    }
}
