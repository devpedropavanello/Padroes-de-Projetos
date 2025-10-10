package padroesestruturais.decorator;

public class AcabamentoVerniz extends ViolaoDecorator {
    public AcabamentoVerniz(Violao violao) {
        super(violao);
    }

    public float getPercentualPreco() {
        return 5.0f;
    }

    public String getNomeDescricao() {
        return "Brilhante";
    }
}
