package padroesestruturais.decorator;

public class Captacao extends ViolaoDecorator {
    public Captacao(Violao violao) {
        super(violao);
    }

    public float getPercentualPreco() {
        return 51.5f;
    }

    public String getNomeDescricao() {
        return "MIDI";
    }
}
