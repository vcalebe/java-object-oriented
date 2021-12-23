package fundamentos;

public class variable {
    public static void main(String[] args) {
        //teste 1
        double pi = 3.14;
        double x = 5 * 10;
        double result = pi + x;
        System.out.println(pi + " + " + x + " = " + result);

        //teste 2
        char letra = 'f';
        boolean ver = true;
        ver = false;

        //teste 3
        double d = 3.14;
        int i = (int) d;
        System.out.println("double = "+d+" int = "+i);

        long testeL = 10000;
        int testeI = (int) x;
        System.out.println("long = "+testeL+" int = "+testeI);

        float k = 3.0f;
        double y = 5;
        float u = (float) y + k;
        System.out.println(u);
    }
}
