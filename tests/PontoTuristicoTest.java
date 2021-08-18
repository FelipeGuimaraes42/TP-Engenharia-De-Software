import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PontoTuristicoTest {
    @Test
    public void itShouldTestGettersAndSetters(){
        PontoTuristico hotel = new Hotel();
        hotel.setNome("dusitD2 Salwa Doha");
        hotel.setEndereco("الدوحة");

        assertEquals(hotel.getNome(), "dusitD2 Salwa Doha");
        assertEquals(hotel.getEndereco(), "الدوحة");
    }

}