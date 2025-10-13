package padroesestruturais.flyweigth;

import java.util.HashMap;
import java.util.Map;

public class PedidoFactory {

    private static Map<String, Pedido> pedidos = new HashMap<>();

    public static Pedido getPedido(String descricao, String ordem) {
        Pedido pedido = pedidos.get(descricao);
        if (pedido == null) {
            pedido = new Pedido(descricao, ordem);
            pedidos.put(descricao, pedido);
        }
        return pedido;
    }

    public static int getTotalPedidos() {
        return pedidos.size();
    }
}

