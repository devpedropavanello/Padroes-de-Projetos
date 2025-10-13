package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoSMSTest {

    @Test
    void deveEnviarNotificacaoSMS() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("SMS");
        assertEquals("SMS enviado", notificacao.enviar());
    }

    @Test
    void deveCancelarNotificacaoSMS() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("SMS");
        assertEquals("SMS cancelado", notificacao.cancelar());
    }
}