import java.util.List;

public class Sede {
    private String nome;
    private String capital;
    private String continente;
    private List<String> curiosidades;

    public Sede(String nome, String capital, String continente, List<String> curiosidades) {
        this.nome = nome;
        this.capital = capital;
        this.continente = continente;
        this.curiosidades = curiosidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public List<String> getCuriosidades() {
        return curiosidades;
    }

    public void setCuriosidades(List<String> curiosidades) {
        this.curiosidades = curiosidades;
    }
}
