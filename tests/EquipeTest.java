import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EquipeTest {

    @Test
    public void itShouldTestGettersAndSetters(){
        Equipe equipe = new Equipe();

        List<PosicionamentoTaticoEnum> posicionamentos = new ArrayList<>();
        posicionamentos.add(PosicionamentoTaticoEnum.PONTA);
        posicionamentos.add(PosicionamentoTaticoEnum.CENTRO_AVANTE);
        Jogador jogador1 = new Jogador("Celsão", LocalDate.of(1998, 9, 7), posicionamentos);
        jogador1.setEquipe(equipe.getNome());

        equipe.setNome("Engenharia de Software");
        equipe.setColocacao("Finalista");
        equipe.setNomeTecnico("Eduardo Figueiredo");
        equipe.setJogadores(List.of(jogador1));

        assertEquals(equipe.getNome(), "Engenharia de Software");
        assertEquals(equipe.getColocacao(), "Finalista");
        assertEquals(equipe.getNomeTecnico(), "Eduardo Figueiredo");
        assertEquals(equipe.getJogadores().get(0).getNome(), "Celsão");
    }

}