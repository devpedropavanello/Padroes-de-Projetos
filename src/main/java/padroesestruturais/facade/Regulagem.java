package padroesestruturais.facade;

public class Regulagem extends Setor {

    private static Regulagem regulagem = new Regulagem();

    private Regulagem() {}

    public static Regulagem getInstance() {
        return regulagem;
    }
}
