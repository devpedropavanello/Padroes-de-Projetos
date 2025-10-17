package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ViolaoTest {

    Violao violao;

    @BeforeEach
    public void setUp() {
        violao = new Violao();
    }

    // Violao Recebido

    @Test
    public void naoDeveReceberViolaoRecebido() {
        violao.setEstado(ViolaoEstadoRecebido.getInstance());
        assertFalse(violao.recebido());
    }

    @Test
    public void deveEntregarViolaoRecebido() {
        violao.setEstado(ViolaoEstadoRecebido.getInstance());
        assertTrue(violao.entregar());
        assertEquals(ViolaoEstadoEntregue.getInstance(), violao.getEstado());
    }

    @Test
    public void deveCancelarViolaoRecebido() {
        violao.setEstado(ViolaoEstadoRecebido.getInstance());
        assertTrue(violao.cancelar());
        assertEquals(ViolaoEstadoCancelado.getInstance(), violao.getEstado());
    }
}