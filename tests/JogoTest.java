import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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

    @Test
    public void itShouldTestGettersAndSetters(){
        Equipe brasil = new Equipe("Brasil", "Tite");
        Equipe argentina = new Equipe("Argentina", "Lionel Scaloni");
        Estadio estadio = new Estadio("Lusail", "Lusail",80000,
                "Em construção. Será sede da abertura e encerramento da Copa do Mundo.");
        LocalDate localDate = LocalDate.now();

        Jogo brasilVsArgentina = new Jogo();
        brasilVsArgentina.setEquipe1(brasil);
        brasilVsArgentina.setEquipe2(argentina);
        brasilVsArgentina.setDataHora(localDate);
        brasilVsArgentina.setLocal(estadio);
        brasilVsArgentina.setGolsEquipe1(5);
        brasilVsArgentina.setGolsEquipe2(4);

        assertEquals(brasilVsArgentina.getEquipe1().getNome(), brasil.getNome());
        assertEquals(brasilVsArgentina.getEquipe2().getNome(), argentina.getNome());
        assertEquals(brasilVsArgentina.getDataHora(), localDate);
        assertEquals(brasilVsArgentina.getLocal().getNome(), estadio.getNome());
        assertEquals(brasilVsArgentina.getGolsEquipe1(), 5);
        assertEquals(brasilVsArgentina.getGolsEquipe2(), 4);
    }

}