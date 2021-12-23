package thread;

public class Main {
    public static void main(String[] args) {
        //exmp 1
        Programa programa = new Programa();
        programa.setId(1);
        Thread thread = new Thread(programa);
        //thread.start();

        //exmp 2
        Programa programa2 = new Programa();
        programa2.setId(2);

        Thread thread2 = new Thread(programa2);

        thread.start();
        thread2.start();
    }
}
