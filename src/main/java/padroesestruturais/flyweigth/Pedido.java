package padroesestruturais.flyweigth;

public class Pedido {

    private String descricao;
    private String ordem;

    public Pedido(String descricao, String ordem) {
        this.descricao = descricao;
        this.ordem = ordem;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getOrdem() {
        return ordem;
    }
}
