package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Violao> violoesComPendencia = new ArrayList<Violao>();

    public void addViolaoPendente(Violao violao) {
        violoesComPendencia.add(violao);
    }

    public boolean verificarViolaoComPendencia(Violao violao) {
        return this.violoesComPendencia.contains(violao);
    }
}
