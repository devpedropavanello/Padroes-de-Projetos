package padroesestruturais.flyweigth;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LuthieriaTest {

    @Test
    void deveRetornarClientes() {
        Luthieria luthieria = new Luthieria();
        luthieria.adicionarCliente("Jose", "Cavaco", "1");
        luthieria.adicionarCliente("Maria", "Cavaco", "1");
        luthieria.adicionarCliente("Ana", "Cavaco", "1");
        luthieria.adicionarCliente("Joao", "Violão 7 cordas", "1");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Jose', pedido='Cavaco', ordem='1'}",
                "Cliente{nome='Maria', pedido='Cavaco', ordem='1'}",
                "Cliente{nome='Ana', pedido='Cavaco', ordem='1'}",
                "Cliente{nome='Joao', pedido='Violão 7 cordas', ordem='1'}");

        assertEquals(saida, luthieria.obterClientes());
    }

    @Test
    void deveRetornarTotalCidades() {
        Luthieria luthieria = new Luthieria();
        luthieria.adicionarCliente("Jose", "Cavaco", "1");
        luthieria.adicionarCliente("Maria", "Cavaco", "1");
        luthieria.adicionarCliente("Ana", "Cavaco", "1");
        luthieria.adicionarCliente("Joao", "Violão 7 cordas", "1");

        assertEquals(2, PedidoFactory.getTotalPedidos());
    }

}
