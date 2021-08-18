import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SedeTest {
    @Test
    public void itShouldTestGettersAndSetters(){
        Sede estadio = new Sede();
        estadio.setNome("Google Meet");
        estadio.setCapital("Interwebs");
        estadio.setContinente("América, porém, somente a do norte");
        estadio.setCuriosidades(List.of("Antes podia mais de uma hora, agora não pode mais..."));

        assertEquals(estadio.getNome(), "Google Meet");
        assertEquals(estadio.getCapital(), "Interwebs");
        assertEquals(estadio.getContinente(), "América, porém, somente a do norte");
        assertEquals(estadio.getCuriosidades().get(0), "Antes podia mais de uma hora, agora não pode mais...");
    }
}