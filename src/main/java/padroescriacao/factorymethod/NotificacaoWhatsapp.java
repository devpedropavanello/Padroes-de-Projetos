package padroescriacao.factorymethod;

public class NotificacaoWhatsapp implements INotificacao {

    public String enviar(){
        return "Whatsapp enviado";
    }

    public String cancelar(){
        return "Whatsapp cancelado";
    }
}
