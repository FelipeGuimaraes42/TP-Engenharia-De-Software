import java.time.LocalDate;
import java.util.List;

public class Jogador {

    private String nome;
    private LocalDate dataDeNascimento;
    private String nomeEquipe;
    private List<PosicionamentoTaticoEnum> posicoes;

    public Jogador(String nome, LocalDate dataDeNascimento, List<PosicionamentoTaticoEnum> posicoes) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.posicoes = posicoes;
    }

    public Jogador(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return (LocalDate.now().getYear() - dataDeNascimento.getYear());
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEquipe() {
        return nomeEquipe;
    }

    public void setEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public List<PosicionamentoTaticoEnum> getPosicionamento() {
        return posicoes;
    }

    public void setPosicionamento(List<PosicionamentoTaticoEnum> posicionamento) {
        this.posicoes = posicionamento;
    }
}
