package padroescomportamentais.state;

public class ViolaoEstadoEmReparo extends ViolaoEstado {

    private ViolaoEstadoEmReparo() {};
    private static ViolaoEstadoEmReparo instance = new ViolaoEstadoEmReparo();
    public static ViolaoEstadoEmReparo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Reparo";
    }

    @Override
    public boolean aguardaPecas(Violao violao) {
        violao.setEstado(ViolaoEstadoAguardandoPecas.getInstance());
        return true;
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