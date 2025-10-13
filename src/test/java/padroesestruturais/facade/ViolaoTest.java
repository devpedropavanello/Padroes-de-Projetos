package padroesestruturais.facade;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ViolaoTest {
    @Test
    void deveRetornarPendenciaCarpintariaFabricar() {
        Violao violao = new Violao();
        Carpintaria.getInstance().addViolaoPendente(violao);
        assertEquals(false, violao.fabricar());
    }

    @Test
    void deveRetornarPendenciaAcabamentoFabricar() {
        Violao violao = new Violao();
        Acabamento.getInstance().addViolaoPendente(violao);
        assertEquals(false, violao.fabricar());
    }

    @Test
    void deveRetornarPendenciaRegulagemFabricar() {
        Violao violao = new Violao();
        Regulagem.getInstance().addViolaoPendente(violao);
        assertEquals(false, violao.fabricar());
    }

    @Test
    void deveRetornarPendenciaEletricaFabricar() {
        Violao violao = new Violao();
        Eletrica.getInstance().addViolaoPendente(violao);
        assertEquals(false, violao.fabricar());
    }
}
