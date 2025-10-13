package padroescriacao.abstractfactory;

public class FabricaEletronica implements FabricaAbstrata{

    @Override
    public InstrumentoMelodia createMelodia() {
        return new Sintetizador();
    }

    @Override
    public InstrumentoPercussao createPercussao() {
        return new DrumMachine();
    }
}
