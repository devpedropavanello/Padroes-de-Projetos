package padroesestruturais.bridge;

public class Euro extends Moeda {

    public Euro(float cotacaoGlobal) {
        super(cotacaoGlobal);
    }

    public float calcularCotacao() {
        return this.cotacaoGlobal * (1 + this.bancos.percentualJuros());
    }
}
