import java.util.List;

public class TabelaDeChaveamento {
    private List<Jogo> oitavas; // 8 jogos, 16 equipes
    private List<Jogo> quartas; // 4 jogos, 8 equipes;
    private List<Jogo> semifinal; // 2 jogos, 4 equipes;
    private List<Jogo> jogoFinal; // 1 jogo, 2 equipes;

    public List<Jogo> getOitavas() {
        return oitavas;
    }

    public void setOitavas(List<Jogo> oitavas) {
        this.oitavas = oitavas;
    }

    public List<Jogo> getQuartas() {
        return quartas;
    }

    public void setQuartas(List<Jogo> quartas) {
        this.quartas = quartas;
    }

    public List<Jogo> getSemifinal() {
        return semifinal;
    }

    public void setSemifinal(List<Jogo> semifinal) {
        this.semifinal = semifinal;
    }

    public List<Jogo> getJogoFinal() {
        return jogoFinal;
    }

    public void setJogoFinal(List<Jogo> jogoFinal) {
        this.jogoFinal = jogoFinal;
    }
}
