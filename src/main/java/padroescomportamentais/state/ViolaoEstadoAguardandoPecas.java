package padroescomportamentais.state;

public class ViolaoEstadoAguardandoPecas extends ViolaoEstado {

    private ViolaoEstadoAguardandoPecas() {};
    private static ViolaoEstadoAguardandoPecas instance = new ViolaoEstadoAguardandoPecas();
    public static ViolaoEstadoAguardandoPecas getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aguardando Pecas";
    }

    public boolean finalizarReparo(Violao violao) {
        violao.setEstado(ViolaoEstadoEntregue.getInstance());
        return true;
    }

    public boolean cancelar(Violao violao) {
        violao.setEstado(ViolaoEstadoCancelado.getInstance());
        return true;
    }
}

