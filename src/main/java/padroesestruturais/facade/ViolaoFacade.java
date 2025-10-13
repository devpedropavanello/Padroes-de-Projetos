package padroesestruturais.facade;

public class ViolaoFacade {

    public static boolean verificarPendenciasFabricacao(Violao violao) {
        if (Carpintaria.getInstance().verificarViolaoComPendencia(violao)) {
            return false;
        }

        if (Acabamento.getInstance().verificarViolaoComPendencia(violao)) {
            return false;
        }

        if (Regulagem.getInstance().verificarViolaoComPendencia(violao)) {
            return false;
        }

        if (Eletrica.getInstance().verificarViolaoComPendencia(violao)) {
            return false;
        }

        return true;
    }
}
