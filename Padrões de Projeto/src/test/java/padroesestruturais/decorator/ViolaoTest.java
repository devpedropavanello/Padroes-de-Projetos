package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViolaoTest {

    @Test
    void deveRetornarPrecoViolaoSimples() {
        Violao violao = new ViolaoSimples(1000.0f);
        assertEquals(1000.0f, violao.getPreco());
    }

    @Test
    void deveRetornarPrecoViolaoCom7Cordas() {
        Violao violao = new Violao7Cordas(new ViolaoSimples(1000.0f));
        assertEquals(1300.0f, violao.getPreco());
    }

    @Test
    void deveRetornarPrecoViolaoComMadeiraNobre() {
        Violao violao = new MadeiraNobre(new ViolaoSimples(1000.0f));
        assertEquals(1500.0f, violao.getPreco());
    }

    @Test
    void deveRetornarPrecoViolaoCom7CordasEMadeiraNobre() {
        Violao violao = new Violao7Cordas(new MadeiraNobre(new ViolaoSimples(1000.0f)));
        assertEquals(1950.0f, violao.getPreco());
    }

    @Test
    void deveRetornarDescricaoViolaoCom7CordasEMadeiraNobre() {
        Violao violao = new Violao7Cordas(new MadeiraNobre(new ViolaoSimples(1000.0f)));
        assertEquals("Violão simples, madeira nobre, 7 cordas", violao.getDescricao());
    }
}
