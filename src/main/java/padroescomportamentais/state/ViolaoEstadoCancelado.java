package padroescomportamentais.state;

public class ViolaoEstadoCancelado extends ViolaoEstado {

    private ViolaoEstadoCancelado() {};
    private static ViolaoEstadoCancelado instance = new ViolaoEstadoCancelado();
    public static ViolaoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }

    public boolean entregar(Violao violao) {
        return true;
    }
}
