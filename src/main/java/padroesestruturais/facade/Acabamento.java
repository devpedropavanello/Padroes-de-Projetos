package padroesestruturais.facade;

public class Acabamento extends Setor {

    private static Acabamento acabamento = new Acabamento();

    private Acabamento() {}

    public static Acabamento getInstance() {
        return acabamento;
    }
}
