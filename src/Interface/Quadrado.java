package Interface;

public class Quadrado implements AreaCalculavel{

    private int lado;

    Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return this.lado;
    }
}
