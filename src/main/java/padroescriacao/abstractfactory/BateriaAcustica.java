package padroescriacao.abstractfactory;

public class BateriaAcustica implements InstrumentoPercussao {

    @Override
    public String tocar() {
        return "Tocando bateria acustica";
    }
}
