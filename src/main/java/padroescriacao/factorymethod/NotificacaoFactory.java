package padroescriacao.factorymethod;

public class NotificacaoFactory {
    public static INotificacao obterNotificacao(String notificacao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Notificacao" + notificacao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Notificacao inexistente");
        }
        if (!(objeto instanceof INotificacao)) {
            throw new IllegalArgumentException("Notificacao inválida");
        }
        return (INotificacao) objeto;
    }
}
