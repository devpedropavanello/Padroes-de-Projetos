package padroesestruturais.facade;

import java.text.Normalizer;

public class Violao {

    public boolean fabricar() {
        return ViolaoFacade.verificarPendenciasFabricacao(this);
    }
}
