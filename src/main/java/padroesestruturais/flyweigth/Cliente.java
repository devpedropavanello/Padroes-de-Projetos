package padroesestruturais.flyweigth;

public class Cliente {

    private String nome;
    private Pedido pedidoFeito;

    public Cliente(String nome, Pedido pedidoFeito) {
        this.nome = nome;
        this.pedidoFeito = pedidoFeito;
    }

    public String obterCliente() {
        return "Cliente{" +
                "nome='" + this.nome +'\'' +
                ", pedido='" + pedidoFeito.getDescricao() + '\'' +
                ", ordem='" + pedidoFeito.getOrdem() + '\'' +
                '}';
    }
}
