package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoPushTest {

    @Test
    void deveEnviarNotificacaoPush() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Push");
        assertEquals("Push enviado", notificacao.enviar());
    }

    @Test
    void deveCancelarNotificacaoPush() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Push");
        assertEquals("Push cancelado", notificacao.cancelar());
    }
}