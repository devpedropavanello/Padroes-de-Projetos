package padroescriacao.factorymethod;

public class NotificacaoSMS implements INotificacao {

    public String enviar(){
        return "SMS enviado";
    }

    public String cancelar(){
        return "SMS cancelado";
    }
}
