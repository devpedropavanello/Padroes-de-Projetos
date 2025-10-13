package padroesestruturais.bridge;

public class Real extends Moeda {

    public Real(float cotacaoGlobal) {
        super(cotacaoGlobal);
    }

    public float calcularCotacao() {
        return this.cotacaoGlobal;
    }
}
