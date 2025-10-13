package padroesestruturais.flyweigth;

import java.util.ArrayList;
import java.util.List;

public class Luthieria {

    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(String nome, String descricao, String ordem) {
        Pedido pedido = PedidoFactory.getPedido(descricao, ordem);
        Cliente cliente = new Cliente(nome, pedido);
        clientes.add(cliente);
    }

    public List<String> obterClientes() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientes) {
            saida.add(cliente.obterCliente());
        }
        return saida;
    }
}
