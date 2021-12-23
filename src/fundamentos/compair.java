package fundamentos;

public class compair {
    public static void main(String[] args) {
        boolean verifica = true;
        int idade = 17;
        boolean amigoDono = false;

        if ((idade >= 18 & verifica) || amigoDono){
            System.out.println("Pode entrar");
        }else{
            System.out.println("Nao pode entrar");
        }
    }
}
