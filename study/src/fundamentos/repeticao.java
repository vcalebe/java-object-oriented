package fundamentos;

public class repeticao {
    public static void main(String[] args) {
        //1-) Imprima todos os números de 150 a 1500 (inclusive).
        int i = 150;
        while (i <= 1500){
            //System.out.println(i);
            i++;
        }

        //2-) Imprima a soma de 1 até 1000 (inclusive).
        int x = 1;
        int y = 1000;
        int v = 1;
        while(x < y){
            v = x + v;
            //System.out.println(v);
            x++;
        }

        //3-) Imprima todos os múltiplos de 3, entre 1 e 100 (inclusive)
        for (x = 1; x <= 100; x++){
            if (x%3 == 0){
                //System.out.println(x);
            }
        }

        //4-) Imprima todos os números entre 1 e 100 (inclusive) dizendo se ele é ou
        //não é múltiplo de 3. (dica: use o operador de resto: %)
        int h = 1;
        while (h <= 100){
            if (h%3 == 0){
                //System.out.println(h + " e divisivel por 3");
            }else{
                //System.out.println(h + " nao e divisivel por 3");
            }
            h++;
        }

        //5-)Imprima todos os múltiplos de 3 ou de 5, entre 1 e 100 (inclusive):
        for(x=1; x<=100; x++){
            if (x%3 == 0 || x%5 == 0){
                //System.out.println(x);
            }
        }
    }
}
