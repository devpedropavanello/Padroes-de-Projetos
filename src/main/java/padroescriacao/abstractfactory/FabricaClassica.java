package padroescriacao.abstractfactory;

public class FabricaClassica implements FabricaAbstrata {

    @Override
    public InstrumentoMelodia createMelodia() {
        return new Piano();
    }

    @Override
    public InstrumentoPercussao createPercussao() {
        return new BateriaAcustica();
    }
}
