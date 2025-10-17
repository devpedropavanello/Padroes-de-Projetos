package padroescomportamentais.state;

public class Violao {

    private String modelo;
    private ViolaoEstado estado;

    public Violao() {
        this.estado = ViolaoEstadoRecebido.getInstance();
    }

    public void setEstado(ViolaoEstado estado) {
        this.estado = estado;
    }

    public boolean recebido() {
        return this.estado.recebido(this);
    }

    public boolean iniciarReparo() {
        return this.estado.iniciarReparo(this);
    }

    public boolean finalizarReparo() {
        return this.estado.finalizarReparo(this);
    }

    public boolean entregar() {
        return this.estado.entregar(this);
    }

    public boolean aguardaPecas() {
        return this.estado.aguardaPecas(this);
    }

    public boolean cancelar() {
        return this.estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ViolaoEstado getEstado() {
        return estado;
    }
}