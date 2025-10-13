package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcessoSistemaTest {

    @Test
    public void deveRetornarUsuarioLogado() {
        AcessoSistema.getInstance().setUsuarioLogado("admin");
        assertEquals("admin", AcessoSistema.getInstance().getUsuarioLogado());
    }

    @Test
    public void deveRetornarPermissaoUsuario() {
        AcessoSistema.getInstance().setPermicoesUsuario("devmaster");
        assertEquals("devmaster", AcessoSistema.getInstance().getPermicoesUsoario());
    }
}