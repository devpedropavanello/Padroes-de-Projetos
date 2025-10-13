package padroesestruturais.decorator;

public abstract class ViolaoDecorator implements Violao {

    private Violao violao;
    public String descricao;

    public ViolaoDecorator(Violao violao) {
        this.violao = violao;
    }

    public Violao getViolao() {
        return violao;
    }

    public void setViolao(Violao violao) {
        this.violao = violao;
    }

    public abstract float getPercentualPreco();

    public float getPreco() {
        return this.violao.getPreco() * (1 + (this.getPercentualPreco() / 100));
    }

    public abstract String getNomeDescricao();

    public String getDescricao() {
        return this.violao.getDescricao() + "/" + this.getNomeDescricao();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}