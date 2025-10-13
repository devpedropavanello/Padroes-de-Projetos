package padroesestruturais.bridge;

public abstract class Moeda {

    protected Bancos bancos;

    protected float cotacaoGlobal;

    public Moeda(float cotacaoGlobal) {
        this.cotacaoGlobal = cotacaoGlobal;
    }

    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }

    public void setCotacaoGlobal(float cotacaoGlobal) {
        this.cotacaoGlobal = cotacaoGlobal;
    }

    public abstract float calcularCotacao();
}
