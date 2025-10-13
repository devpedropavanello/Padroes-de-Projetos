package padroescriacao.singleton;

public class AcessoSistema {

    private AcessoSistema(){};
    private static AcessoSistema acesso = new AcessoSistema();

    public static AcessoSistema getInstance(){
        return acesso;
    }

    private String usuarioLogado;
    private String permicoesUsuario;

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public String getPermicoesUsoario() {
        return permicoesUsuario;
    }

    public void setPermicoesUsuario(String permicoesUsuario) {
        this.permicoesUsuario = permicoesUsuario;
    }
}
