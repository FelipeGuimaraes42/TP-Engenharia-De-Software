import java.time.LocalDate;

public class Jogo {

    private Equipe equipe1;
    private Equipe equipe2;
    private int golsEquipe1;
    private int golsEquipe2;
    private Estadio local;
    private LocalDate dataHora;

    public Jogo(Equipe equipe1, Equipe equipe2, int golsEquipe1, int golsEquipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.golsEquipe1 = golsEquipe1;
        this.golsEquipe2 = golsEquipe2;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public int getGolsEquipe1() {
        return golsEquipe1;
    }

    public void setGolsEquipe1(int golsEquipe1) {
        this.golsEquipe1 = golsEquipe1;
    }

    public int getGolsEquipe2() {
        return golsEquipe2;
    }

    public void setGolsEquipe2(int golsEquipe2) {
        this.golsEquipe2 = golsEquipe2;
    }

    public Estadio getLocal() {
        return local;
    }

    public void setLocal(Estadio local) {
        this.local = local;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }

    public Equipe getVencedor(){
        if(this.golsEquipe1 > this.golsEquipe2){
            return equipe1;
        }

        if(this.golsEquipe1 < this.golsEquipe2){
            return equipe2;
        }

        return null;
    }

}
