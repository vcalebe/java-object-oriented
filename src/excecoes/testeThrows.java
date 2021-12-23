package excecoes;

public class testeThrows {
    public static void testando() throws ArithmeticException{
        int i = 2;
        i = i/0;
        System.out.println(i);
    }
}
