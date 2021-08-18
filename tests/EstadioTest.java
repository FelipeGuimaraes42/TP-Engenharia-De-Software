import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstadioTest {
    @Test
    public void itShouldTestGettersAndSetters(){
        Estadio estadio = new Estadio();
        estadio.setNome("Google Meet");
        estadio.setEndereco("Interwebs");
        estadio.setCapacidade(100);
        estadio.setHistoria("Antes podia mais de uma hora, agora não pode mais...");

        assertEquals(estadio.getNome(), "Google Meet");
        assertEquals(estadio.getEndereco(), "Interwebs");
        assertEquals(estadio.getCapacidade(), 100);
        assertEquals(estadio.getHistoria(), "Antes podia mais de uma hora, agora não pode mais...");
    }
}