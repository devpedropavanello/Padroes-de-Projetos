package padroescriacao.abstractfactory;

public class Piano implements InstrumentoMelodia {

    @Override
    public String tocar() {
        return "Tocando Piano";
    }

}
