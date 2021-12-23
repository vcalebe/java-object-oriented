package empresaEstruturada;

import array.empresaMultinacional.Empresa;

public class Main {
    public static void main(String[] args) {
        EmpresaEst gol;
        gol = new EmpresaEst(2);
        gol.setNome("gol");
        gol.setCnpj("33232");

        FuncionarioEst func1;
        func1 = new FuncionarioEst();
        func1.setNome("pedro");

        FuncionarioEst func2;
        func2 = new FuncionarioEst();
        func2.setNome("Joao");

        System.out.println(gol.getNome());
        System.out.println(gol.getCnpj());
        System.out.println(func1.getId());
        System.out.println(func1.getNome());
        System.out.println(func2.getId());
        System.out.println(func2.getNome());
    }
}
