package padroescomportamentais.state;

public class ViolaoEstadoFinalizado extends ViolaoEstado {

    private ViolaoEstadoFinalizado() {};
    private static ViolaoEstadoFinalizado instance = new ViolaoEstadoFinalizado();
    public static ViolaoEstadoFinalizado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Finalizado";
    }

    public boolean entregar(Violao violao) {
        return true;
    }
}

