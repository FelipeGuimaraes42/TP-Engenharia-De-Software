import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    @Test
    public void itShouldCreateAPlayerSuccessfully(){
        List<PosicionamentoTaticoEnum> posicionamentos = new ArrayList<>();
        posicionamentos.add(PosicionamentoTaticoEnum.PONTA);
        posicionamentos.add(PosicionamentoTaticoEnum.CENTRO_AVANTE);
        Equipe brasil = new Equipe("Brasil", "Tite");

        Jogador jogador = new Jogador("Celsão", LocalDate.of(1999, 9, 7), posicionamentos);
        jogador.setEquipe(brasil);

        assertEquals(jogador.getNome(), "Celsão");
        assertEquals(jogador.getIdade(), 22);
        assertEquals(jogador.getEquipe().getNome(), "Brasil");
        assertEquals(jogador.getPosicionamento().get(0), PosicionamentoTaticoEnum.PONTA);
        assertEquals(jogador.getPosicionamento().get(1), PosicionamentoTaticoEnum.CENTRO_AVANTE);
    }

}