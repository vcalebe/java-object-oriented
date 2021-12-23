package array.automatizandoCasa;

public class Casa {
    String cor;
    int totalPortas;
    Portas[] portas;

    void pinta(String cor){
        this.cor = cor;
        System.out.println("A cor da casa e = "+ this.cor);
    }

    void adicionaPortas(Portas p){
        for (int x=0; x<this.portas.length; x++){
            if (this.portas[x] == null){
                this.portas[x] = p;

                totalPortas+=1;
                break;
            }
        }
    }

    int quantPortasAbertas(){
        int cont = 0;
        for (int x=0; x<portas.length; x++){
            if (portas[x] != null){
                if (portas[x].estado == true){
                    cont = cont + 1;
                }
            }else {
                break;
            }
        }
        return cont;
    }
}
