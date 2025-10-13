package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DolarTest {

    @Test
    void deveRetornarCotacaoDolarBancoSantander() {
        Bancos bancos = new Santander();
        Dolar dolar = new Dolar(5000.0f);
        dolar.setBancos(bancos);
        assertEquals(5000.0f, dolar.calcularCotacao(), 0.1f);
    }

    @Test
    void deveRetornarCotacaoDolarBancoItau() {
        Bancos bancos = new Itau();
        Dolar dolar = new Dolar(5000.0f);
        dolar.setBancos(bancos);
        assertEquals(5500.0f, dolar.calcularCotacao(), 0.1f);
    }

    @Test
    void deveRetornarCotacaoDolarBancoBradesco() {
        Bancos bancos = new Bradesco();
        Dolar dolar = new Dolar(5000.0f);
        dolar.setBancos(bancos);
        assertEquals(6000.0f, dolar.calcularCotacao(), 0.1f);
    }

    @Test
    void deveRetornarCotacaoDolarBancoCaixa() {
        Bancos bancos = new Caixa();
        Dolar dolar = new Dolar(5000.0f);
        dolar.setBancos(bancos);
        assertEquals(6500.0f, dolar.calcularCotacao(), 0.1f);
    }
}
