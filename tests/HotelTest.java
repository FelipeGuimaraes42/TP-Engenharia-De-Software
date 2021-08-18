import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    @Test
    public void itShouldTestGettersAndSetters(){
        Hotel hotel = new Hotel();
        hotel.setNome("dusitD2 Salwa Doha");
        hotel.setAvaliacao(5);
        hotel.setEstadia(31);
        hotel.setEndereco("الدوحة");

        assertEquals(hotel.getNome(), "dusitD2 Salwa Doha");
        assertEquals(hotel.getAvaliacao(), 5);
        assertEquals(hotel.getEstadia(), 31);
        assertEquals(hotel.getEndereco(), "الدوحة");
    }
}