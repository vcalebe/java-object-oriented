package Interface.bancoInterface;

public class GerenciadorImportRenda {
    private double taxa;
    private double total;

    GerenciadorImportRenda(double taxa){
        this.taxa = taxa;
    }

    void add(Tributavel t){
        System.out.println("Adicionando Tributavel: "+t.calculaTributos(this.taxa));
        this.total+=t.calculaTributos(this.taxa);
        System.out.println("total: "+this.total);
    }
}
