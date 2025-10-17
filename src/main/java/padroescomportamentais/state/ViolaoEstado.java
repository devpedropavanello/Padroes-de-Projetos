package padroescomportamentais.state;

public abstract class ViolaoEstado {

    public abstract String getEstado();

    public boolean recebido(Violao violao) {
        return false;
    }

    public boolean iniciarReparo(Violao violao) {
        return false;
    }

    public boolean finalizarReparo(Violao violao) {
        return false;
    }

    public boolean entregar(Violao violao) {
        return false;
    }

    public boolean aguardaPecas(Violao violao) {
        return false;
    }

    public boolean cancelar(Violao violao) {
        return false;
    }
}