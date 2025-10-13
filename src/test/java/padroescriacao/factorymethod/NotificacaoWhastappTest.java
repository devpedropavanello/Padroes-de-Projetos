package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoWhastappTest {

    @Test
    void deveEnviarNotificacaoWhatsapp() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Whatsapp");
        assertEquals("Whatsapp enviado", notificacao.enviar());
    }

    @Test
    void deveCancelarNotificacaoWhatsapp() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Whatsapp");
        assertEquals("Whatsapp cancelado", notificacao.cancelar());
    }
}
