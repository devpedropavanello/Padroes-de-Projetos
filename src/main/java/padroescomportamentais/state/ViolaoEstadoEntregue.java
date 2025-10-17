package padroescomportamentais.state;

public class ViolaoEstadoEntregue extends ViolaoEstado {

    private ViolaoEstadoEntregue() {};
    private static ViolaoEstadoEntregue instance = new ViolaoEstadoEntregue();
    public static ViolaoEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }
}