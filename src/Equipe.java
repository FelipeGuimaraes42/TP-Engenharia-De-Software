import java.util.List;

public class Equipe {
    private String nome;
    private List<Jogador> jogadores;
    private String colocacao;
    private String nomeTecnico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public String getColocacao() {
        return colocacao;
    }

    public void setColocacao(String colocacao) {
        this.colocacao = colocacao;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }
}
