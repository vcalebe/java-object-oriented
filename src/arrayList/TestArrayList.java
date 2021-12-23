package arrayList;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        //exp 1
        Pais brasil = new Pais();
        brasil.nome = "Brasil";
        brasil.kmQuadrados = 8511965.0;

        Pais japao = new Pais();
        japao.nome = "Japão";
        japao.kmQuadrados = 377815.0;

        Pais eua = new Pais();
        eua.nome = "EUA";
        eua.kmQuadrados = 9629091.0;

        ArrayList list = new ArrayList();
        list.add(brasil);
        list.add(japao);
        list.add(eua);

        //System.out.println("Tamanho da lista = "+list.size());

        //exp 2
        for (int i = 0; i!=list.size(); i++){
            //cast para Pais
            Pais paisAtual = (Pais) list.get(i);

            //System.out.println("Pais na posicao "+i+" = "+paisAtual.nome);
        }

        //exp 3
        ArrayList<Pais> list2 = new ArrayList<Pais>();

        list2.add(brasil);
        list2.add(eua);
        System.out.println(list2.get(1).nome);
    }
}
