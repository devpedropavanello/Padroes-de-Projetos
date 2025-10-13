package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaNotificacaoInexistente() {
        try {
            INotificacao notificacao = NotificacaoFactory.obterNotificacao("Instagram");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Notificacao inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNotificacaoInvalido() {
        try {
            INotificacao notificacao = NotificacaoFactory.obterNotificacao("Email");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Notificacao inválida", e.getMessage());
        }
    }
}