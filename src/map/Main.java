package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pais guiana = new Pais("Guiana Francesa");
        Pais uruguai = new Pais("Uruguai");
        Pais brasil = new Pais("Brasil");
        Pais belgica = new Pais("Belgica");

        //cria mapa, passando como parametro <chave, valor>
        Map<String,Pais> mapa = new HashMap<String,Pais>();

        //adicionando chave o obj
        mapa.put("ganhou copa",brasil);
        mapa.put("sem copa",guiana);
        mapa.put("sem copa",belgica);
        mapa.put("ganhou copa",uruguai);

        Pais paisVerif = mapa.get("ganhou copa");
        System.out.println(paisVerif.nome);

    }
}
