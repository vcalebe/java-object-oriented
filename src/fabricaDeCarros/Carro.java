package fabricaDeCarros;

public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMax;
    boolean estado = false;
    Motor motor;

    void ligarCarro(){
        System.out.println("Carro ligado");
        estado = true;
    }
    void acelera(double quant){
        double novaVelo = this.velocidadeAtual + quant;
        this.velocidadeAtual = novaVelo;
    }
    int marcha(){
        if (this.velocidadeAtual < 0){
            return -1;
        }if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40){
            return 1;
        }if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80){
            return 2;
        }
        return 3;
    }
}
