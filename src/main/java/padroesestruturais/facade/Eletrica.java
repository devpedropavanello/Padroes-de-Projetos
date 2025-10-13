package padroesestruturais.facade;

public class Eletrica extends Setor {

    private static Eletrica eletrica = new Eletrica();

    private Eletrica() {}

    public static Eletrica getInstance() {
        return eletrica;
    }
}
