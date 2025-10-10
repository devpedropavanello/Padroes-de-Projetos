package padroesestruturais.decorator;

public class Captacao extends ViolaoDecorator {
    public Captacao(Violao violao) {
        super(violao);
    }

    public float getPercentualPreco() {
        return 30.0f;
    }

    public String getNomeDescricao() {
        return "MIDI";
    }
}
