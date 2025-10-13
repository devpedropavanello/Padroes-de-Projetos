package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuroTest {

    @Test
    void deveRetornarCotacaoEuroBancoSantander() {
        Bancos bancos = new Santander();
        Euro euro = new Euro(2000.0f);
        euro.setBancos(bancos);
        assertEquals(2000.0f, euro.calcularCotacao(), 0.1f);
    }

    @Test
    void deveRetornarCotacaoEuroBancoItau() {
        Bancos bancos = new Itau();
        Euro euro = new Euro(2000.0f);
        euro.setBancos(bancos);
        assertEquals(2200.0f, euro.calcularCotacao(), 0.1f);
    }

    @Test
    void deveRetornarCotacaoEuroBancoBradesco() {
        Bancos bancos = new Bradesco();
        Euro euro = new Euro(2000.0f);
        euro.setBancos(bancos);
        assertEquals(2400.0f, euro.calcularCotacao(), 0.1f);
    }

    @Test
    void deveRetornarCotacaoEuroBancoCaixa() {
        Bancos bancos = new Caixa();
        Euro euro = new Euro(2000.0f);
        euro.setBancos(bancos);
        assertEquals(2600.0f, euro.calcularCotacao(), 0.1f);
    }
}