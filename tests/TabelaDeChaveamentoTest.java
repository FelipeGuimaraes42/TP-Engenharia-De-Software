import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TabelaDeChaveamentoTest {
    @Test
    public void itShouldValidateTheSemifinalWinners() {
        TabelaDeChaveamento tabela = new TabelaDeChaveamento();

        List<Jogo> semi = new ArrayList<>();
        Equipe alemanha = new Equipe("Alemanha", "Hans-Dieter Flick");
        Equipe argentina = new Equipe("Argentina", "Lionel Scaloni");
        Equipe brasil = new Equipe("Brasil", "Tite");
        Equipe franca = new Equipe("França", "Didier Deschamps");

        Jogo jogo1 = new Jogo(alemanha, franca, 3, 2);
        Jogo jogo2 = new Jogo(brasil, argentina, 5, 0);

        semi.add(jogo1);
        semi.add(jogo2);
        tabela.setSemifinal(semi);

        assertEquals(tabela.getSemifinal().get(0).getVencedor().getNome(), alemanha.getNome());
        assertEquals(tabela.getSemifinal().get(1).getVencedor().getNome(), brasil.getNome());
    }
}