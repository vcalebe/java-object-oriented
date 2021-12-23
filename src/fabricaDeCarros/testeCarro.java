package fabricaDeCarros;

public class testeCarro {
    public static void main(String[] args) {
        Carro popular;
        popular = new Carro();
        popular.cor = "verde";
        popular.modelo = "corsa";
        popular.velocidadeAtual = 0;
        popular.velocidadeMax = 100;

        popular.ligarCarro();

        popular.acelera(20);
        //sout
        System.out.println(popular.velocidadeAtual);
    }
}
