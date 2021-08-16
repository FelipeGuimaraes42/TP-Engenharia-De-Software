import java.time.LocalDate;

public class Jogo {

    private Equipe equipe1;
    private Equipe equipe2;
    private Estadio local;
    private LocalDate dataHora;

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

    public Equipe getVencedor(Equipe equipe1, Equipe equipe2, int gols1, int gols2){
        if(gols1 > gols2){
            return equipe1;
        }
        else if (gols1 == gols2) {
            System.out.println("Empate!");
            return equipe1;
        }
        else {
            return equipe2;
        }
    }

}
