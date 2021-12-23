package excecoes.ContaExcecao;

public class SaldoInsufiException extends RuntimeException{
    private String msg;

    SaldoInsufiException(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        String rascunho = "Erro relacionado ao saldo -> ";
        return rascunho+this.msg;
    }
}
