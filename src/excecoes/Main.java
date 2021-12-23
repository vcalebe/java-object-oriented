package excecoes;

public class Main {
    public static void main(String[] args) {
        //divisao por zero
        try{
            int i = 400;
            i = i/0;
            System.out.println(i);
        }catch (ArithmeticException erro){
            System.out.println(erro.getMessage());
        }

        //erro com array
        int novoArray[] = new int[3];
        try{
            novoArray[0] = 1;
            novoArray[1] = 2;
            novoArray[2] = 3;
            novoArray[3] = 4;
        }catch (ArrayIndexOutOfBoundsException error){
            System.out.println(error.getMessage());
        }

    }
}
