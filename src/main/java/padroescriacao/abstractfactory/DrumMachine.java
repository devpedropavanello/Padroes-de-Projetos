package padroescriacao.abstractfactory;

public class DrumMachine implements InstrumentoPercussao {

    @Override
    public String tocar() {
        return "Tocando DrumMachine";
    }
}
