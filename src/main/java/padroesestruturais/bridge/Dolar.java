package padroesestruturais.bridge;

public class Dolar extends Moeda {

    public Dolar(float cotacaoGlobal) {
        super(cotacaoGlobal);
    }

    public float calcularCotacao() {
        return this.cotacaoGlobal * (1 + this.bancos.percentualJuros());
    }
}
