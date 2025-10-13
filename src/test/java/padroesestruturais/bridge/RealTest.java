package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealTest {

    @Test
    void deveRetornarCotacaoRealBancoSantander() {
        Bancos bancos = new Santander();
        Real real = new Real(1000.0f);
        real.setBancos(bancos);
        assertEquals(1000.0f, real.calcularCotacao(), 0.1f);
    }

    @Test
    void deveRetornarCotacaoRealBancoItau() {
        Bancos bancos = new Itau();
        Real real = new Real(1000.0f);
        real.setBancos(bancos);
        assertEquals(1000.0f, real.calcularCotacao(), 0.1f);
    }

    @Test
    void deveRetornarCotacaoRealBancoBradesco() {
        Bancos bancos = new Bradesco();
        Real real = new Real(1000.0f);
        real.setBancos(bancos);
        assertEquals(1000.0f, real.calcularCotacao(), 0.1f);
    }

    @Test
    void deveRetornarCotacaoRealBancoCaixa() {
        Bancos bancos = new Caixa();
        Real real = new Real(1000.0f);
        real.setBancos(bancos);
        assertEquals(1000.0f, real.calcularCotacao(), 0.1f);
    }
}
