package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ViolaoTest {

    @Test
    void deveRetornarPrecoViolao7Cordas() {
        Violao violao = new Violao7Cordas(4000.0f);
        assertEquals(4000.0f, violao.getPreco());
    }
    @Test
    void deveRetornarPrecoViolao7CordasComAcabamentoVerniz() {
        Violao violao = new AcabamentoVerniz(new Violao7Cordas(4000.0f));
        assertEquals(4400.0f, violao.getPreco());
    }

    @Test
    void deveRetornarPrecoViolao7CordasComTipoMadeira() {
        Violao violao = new TipoMadeira(new Violao7Cordas(4000.0f));
        assertEquals(5400.0f, violao.getPreco());
    }

    @Test
    void deveRetornarPrecoViolao7CordasComCaptacao() {
        Violao violao = new Captacao(new Violao7Cordas(4000.0f));
        assertEquals(6060.0f, violao.getPreco());
    }

    @Test
    void deveRetornarPrecoViolao7CordasComCaptacaoMaisAcabamentoVerniz() {
        Violao violao = new AcabamentoVerniz(new Captacao(new Violao7Cordas(4000.0f)));
        assertEquals(6666.0, violao.getPreco());
    }

    @Test
    void deveRetornarPrecoViolao7CordasComCaptacaoMaisTipoMadeira() {
        Violao violao = new TipoMadeira(new Captacao(new Violao7Cordas(4000.0f)));
        assertEquals(8181.0f, violao.getPreco());
    }

    @Test
    void deveRetornarPrecoViolao7CordasComAcabamentoVernizMaisTipoMadeira() {
        Violao violao = new TipoMadeira(new AcabamentoVerniz(new Violao7Cordas(4000.0f)));
        assertEquals(5940.0f, violao.getPreco());
    }

    @Test
    void deveRetornarPrecoViolao7CordasComAcabamentoVernizMaisTipoMadeiraMaisCaptacao() {
        Violao violao = new Captacao(new TipoMadeira(new AcabamentoVerniz(new Violao7Cordas(4000.0f))));
        assertEquals(8999.1f, violao.getPreco());
    }

    @Test
    void deveRetornarDescricaoViolao() {
        Violao violao = new Violao7Cordas();
        assertEquals("Violao 7 cordas", violao.getDescricao());
    }

    @Test
    void deveRetornarDescricaoViolaoComAcabamentoVerniz() {
        Violao violao = new AcabamentoVerniz(new Violao7Cordas());
        assertEquals("Violao 7 cordas/Brilhante", violao.getDescricao());
    }

    @Test
    void deveRetornarDescricaoViolaoComTipoMadeira() {
        Violao violao = new TipoMadeira(new Violao7Cordas());
        assertEquals("Violao 7 cordas/Jacarandá", violao.getDescricao());
    }

    @Test
    void deveRetornarDescricaoViolaoComCaptacao() {
        Violao violao = new Captacao(new Violao7Cordas());
        assertEquals("Violao 7 cordas/MIDI", violao.getDescricao());
    }

    @Test
    void deveRetornarDescricaoViolaoComCaptacaoMaisAcabamentoVerniz() {
        Violao violao = new AcabamentoVerniz(new Captacao(new Violao7Cordas()));
        assertEquals("Violao 7 cordas/MIDI/Brilhante", violao.getDescricao());
    }

    @Test
    void deveRetornarDescricaoViolaoComCaptacaoMaisTipoMadeira() {
        Violao violao = new TipoMadeira(new Captacao(new Violao7Cordas()));
        assertEquals("Violao 7 cordas/MIDI/Jacarandá", violao.getDescricao());
    }

    @Test
    void deveRetornarDescricaoViolaoComAcabamentoVernizMaisTipoMadeira() {
        Violao violao = new TipoMadeira(new AcabamentoVerniz(new Violao7Cordas()));
        assertEquals("Violao 7 cordas/Brilhante/Jacarandá", violao.getDescricao());
    }

    @Test
    void deveRetornarDescricaoViolaoComAcabamentoVernizMaisTipoMadeiraMaisCaptacao() {
        Violao violao = new Captacao(new TipoMadeira(new AcabamentoVerniz(new Violao7Cordas())));
        assertEquals("Violao 7 cordas/Brilhante/Jacarandá/MIDI", violao.getDescricao());
    }
}
