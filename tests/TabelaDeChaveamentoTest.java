import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TabelaDeChaveamentoTest {
    @Test
    public void testShouldSetJogosDasOitavas() {
        TabelaDeChaveamento tabela = new TabelaDeChaveamento();

        List<Jogo> oitavas = new ArrayList<>();
        Equipe alemanha = new Equipe("Alemanha", "Hans-Dieter Flick");
        Equipe argentina = new Equipe("Argentina", "Lionel Scaloni");
        Equipe brasil = new Equipe("Brasil", "Tite");
        Equipe franca = new Equipe("França", "Didier Deschamps");

        Jogo jogo1 = new Jogo();
        Jogo jogo2 = new Jogo();

        oitavas.add(jogo1);
        oitavas.add(jogo2);
        tabela.setOitavas(oitavas);

        assertEquals(tabela.getOitavas(), oitavas);
    }
}