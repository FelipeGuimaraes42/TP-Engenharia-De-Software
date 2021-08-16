import java.time.LocalDate;
import java.util.List;

public class Jogador {

    private String nome;
    private LocalDate dataDeNascimento;
    private Equipe equipe;
    private List<PosicionamentoTaticoEnum> posicoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public List<PosicionamentoTaticoEnum> getPosicionamento() {
        return posicoes;
    }

    public void setPosicionamento(List<PosicionamentoTaticoEnum> posicionamento) {
        this.posicoes = posicionamento;
    }
}
