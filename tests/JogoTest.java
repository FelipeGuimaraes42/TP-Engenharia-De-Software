import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogoTest {

    @Test
    public void itShouldVerifyTheWinner(){
        Equipe brasil = new Equipe("Brasil", "Tite");
        Equipe argentina = new Equipe("Argentina", "Lionel Scaloni");

        Jogo brasilVsArgentina = new Jogo(brasil, argentina, 3, 2);

        assertEquals(brasilVsArgentina.getVencedor().getNome(), brasil.getNome());
    }

    @Test
    public void itShouldReturnNullIfItIsATie(){
        Equipe brasil = new Equipe("Brasil", "Tite");
        Equipe argentina = new Equipe("Argentina", "Lionel Scaloni");

        Jogo brasilVsArgentina = new Jogo(brasil, argentina, 3, 3);

        assertNull(brasilVsArgentina.getVencedor());
    }

}