package padroescomportamentais.state;

public class ViolaoEstadoRecebido extends ViolaoEstado {

    private ViolaoEstadoRecebido() {};
    private static ViolaoEstadoRecebido instance = new ViolaoEstadoRecebido();
    public static ViolaoEstadoRecebido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recebido";
    }

    public boolean iniciarReparo(Violao violao) {
        violao.setEstado(ViolaoEstadoEmReparo.getInstance());
        return true;
    }

    public boolean cancelar(Violao violao) {
        violao.setEstado(ViolaoEstadoCancelado.getInstance());
        return true;
    }
}

