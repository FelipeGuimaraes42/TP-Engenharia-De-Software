public class Hotel extends PontoTuristico {
    private int avaliacao; // avaliação medida em estrelas
    private float estadia;

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int classificacao) {
        this.avaliacao = classificacao;
    }

    public float getEstadia() {
        return estadia;
    }

    public void setEstadia(int estadia) {
        this.estadia = estadia;
    }
}
