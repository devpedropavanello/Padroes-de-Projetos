package padroescriacao.abstractfactory;

public class Musico{

    private InstrumentoMelodia instrumentoMelodia;
    private InstrumentoPercussao instrumentoPercussao;

    public Musico (FabricaAbstrata fabrica){
        this.instrumentoMelodia = fabrica.createMelodia();
        this.instrumentoPercussao = fabrica.createPercussao();
    }

    public String tocarInstrumentoMelodia(){
        return this.instrumentoMelodia.tocar();
    }

    public String tocarInstrumentoPercussao(){
        return this.instrumentoPercussao.tocar();
    }
}
