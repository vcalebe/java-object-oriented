package conjunto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set conjunto = new HashSet();
        conjunto.add("Veiga");
        conjunto.add("Ewerton");
        conjunto.add("Gomez");

        //System.out.println(conjunto);

        //retorna iterator
        Iterator i = conjunto.iterator();
        while (i.hasNext()){
            Object elem = i.next();
            String palavra = (String) elem;

            System.out.println(palavra);
        }
    }
}
