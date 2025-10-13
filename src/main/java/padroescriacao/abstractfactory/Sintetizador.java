package padroescriacao.abstractfactory;

public class Sintetizador implements InstrumentoMelodia {

    @Override
    public String tocar() {
        return "Tocando sintetizador";
    }
}
