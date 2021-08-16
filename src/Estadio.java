public class Estadio extends PontoTuristico {
    private int capacidade;
    private String historia;

    public Estadio(String nome, String endereco, int capacidade, String historia) {
        setNome(nome);
        setEndereco(endereco);

        this.capacidade = capacidade;
        this.historia = historia;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
