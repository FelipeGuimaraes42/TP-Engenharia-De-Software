import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {

    public void home(){
        Scanner scanner = new Scanner(System.in);
        String opcao;

        System.out.println("Seja bem-vindo ao seu guia da Copa do Mundo do Catar!");
        System.out.println("Neste sistema você conseguirá encontrar todas as informações " +
                "relevantes sobre a Copa de 2022!");
        menuInicial();
        System.out.print("Insira a opção desejada: ");
        opcao = scanner.nextLine();

        switch (opcao) {
            case "1" -> verInformacoesGeraisDaCopa();
            case "2" -> verEquipes();
            default -> System.out.println("Obrigado pela visita! Volte sempre!");
        }
    }

    public void menuInicial(){
        System.out.println("Digite 1 para ver as informações gerais da copa");
        System.out.println("Digite 2 para ver as equipes");
        System.out.println("Digite 3 para ver os estádios");
        System.out.println("Digite esc para sair");
    }

    public void verInformacoesGeraisDaCopa() { // Verificar necessidade disso ter classe
        System.out.println("Informações Gerais");
        System.out.println("País sede: Catar");
        System.out.println("Quantidade de países: 16");
        System.out.println("É noises");
    }

    public void consultarTabelaDeChaveamento() {
        // Abre a classe da Tabela de Chaveamento
    }

    public void consultarSede() {
        // Abre nova classe do consultar Sede;
    }

    public void verEquipes() {
        List<Equipe> equipes = new ArrayList<>();

        equipes.add(new Equipe("Brasil", "Tite"));
        equipes.add(new Equipe("Argentina", "Lionel Scaloni"));

        for (Equipe equipe : equipes) {
            System.out.println("Seleção: " + equipe.getNome());
            System.out.println("Técnico: " + equipe.getNome());
        }
    }
}
