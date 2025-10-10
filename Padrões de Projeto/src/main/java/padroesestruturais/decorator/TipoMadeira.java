package padroesestruturais.decorator;

public class TipoMadeira extends ViolaoDecorator {
    public TipoMadeira(Violao violao) {
        super(violao);
    }

    public float getPercentualPreco() {
        return 15.0f;
    }

    public String getNomeDescricao() {
        return "Jacarandá";
    }
}
