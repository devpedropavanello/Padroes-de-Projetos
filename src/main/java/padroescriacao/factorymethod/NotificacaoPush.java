package padroescriacao.factorymethod;

public class NotificacaoPush implements INotificacao {

    public String enviar() {
        return "Push enviado";
    }

    public String cancelar() {
        return "Push cancelado";
    }
}
