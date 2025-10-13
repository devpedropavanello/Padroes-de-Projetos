package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicoTest {

    @Test
    void deveTocarMusicaClassica_Melodia() {
        FabricaAbstrata fabrica = new FabricaClassica();
        Musico musico = new Musico(fabrica);
        assertEquals("Tocando Piano", musico.tocarInstrumentoMelodia());
    }

    @Test
    void deveTocarMusicaClassica_Percussao() {
        FabricaAbstrata fabrica = new FabricaClassica();
        Musico musico = new Musico(fabrica);
        assertEquals("Tocando bateria acustica", musico.tocarInstrumentoPercussao());
    }

    @Test
    void deveTocarMusicaEletronica_Melodia() {
        FabricaAbstrata fabrica = new FabricaEletronica();
        Musico musico = new Musico(fabrica);
        assertEquals("Tocando sintetizador", musico.tocarInstrumentoMelodia());
    }

    @Test
    void deveTocarMusicaEletronica_Percussao() {
        FabricaAbstrata fabrica = new FabricaEletronica();
        Musico musico = new Musico(fabrica);
        assertEquals("Tocando DrumMachine", musico.tocarInstrumentoPercussao());
    }
}