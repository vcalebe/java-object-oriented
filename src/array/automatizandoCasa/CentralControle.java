package array.automatizandoCasa;

import java.awt.*;

public class CentralControle {
    public static void main(String[] args) {
        Casa praia = new Casa();
        praia.cor = "verde";
        praia.portas = new Portas[6];

        Portas entrada = new Portas();
        Portas saida = new Portas();
        Portas varanda = new Portas();
        varanda.abrir();
        saida.abrir();
        entrada.fechar();

        praia.adicionaPortas(entrada);
        praia.adicionaPortas(saida);
        praia.adicionaPortas(varanda);

        System.out.println("Existem "+praia.quantPortasAbertas()+" Porta(s) aberta(s)");
        System.out.println("Total de portas = "+praia.totalPortas);
    }
}
