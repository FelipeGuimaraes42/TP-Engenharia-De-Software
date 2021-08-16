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
            case "3" -> consultarSede();
            case "4" -> verEstadios();
            default -> System.out.println("Obrigado pela visita! Volte sempre!");
        }
    }

    public void menuInicial(){
        System.out.println("Digite 1 para ver as informações gerais da copa");
        System.out.println("Digite 2 para ver as equipes");
        System.out.println("Digite 3 para saber mais sobre a sede");
        System.out.println("Digite 4 para ver os estádios");
        System.out.println("Digite esc para sair");
    }

    public void verInformacoesGeraisDaCopa() {
        System.out.println("Informações Gerais");
        System.out.println("País sede: Catar");
        System.out.println("Quantidade de países: 16");
        System.out.println("É noises");
    }

    public void consultarTabelaDeChaveamento() {
        // Abre a classe da Tabela de Chaveamento
    }

    public void consultarSede() {
        List<String> curiosidades = new ArrayList<>();

        curiosidades.add("O Catar é considerado o país mais rico do mundo;");
        curiosidades.add("O Catar fica entre o mar e o deserto;");
        curiosidades.add("O nome “Catar” vem de “Qatara” que, segundo a tradição, refere-se à antiga cidade de\n\t" +
                "   Zubarah, famosa por ter sido um importante porto comercial na região;");
        curiosidades.add("O islã é a principal religião do Catar;");
        curiosidades.add("O árabe é a língua oficial do Catar;");
        curiosidades.add("As casas tradicionais no Catar são amarelas;");
        curiosidades.add("O Catar é considerado o país mais seguro do mundo.");

        Sede sede = new Sede("Catar", "Doha", "Ásia", curiosidades);

        System.out.println("Sede: " + sede.getNome());
        System.out.println("Capital: " + sede.getCapital());
        System.out.println("Continente: " + sede.getContinente());

        System.out.println("Curiosidades:");
        for(int i =0; i < sede.getCuriosidades().size(); i++){
            System.out.println("\t" + (i+1) + ". " + sede.getCuriosidades().get(i));
        }
    }

    void verEstadios(){
        System.out.println("Estádios");
    }

    public void verEquipes() {
        List<Equipe> equipes = new ArrayList<>();

        equipes.add(new Equipe("Argentina", "Lionel Scaloni"));
        equipes.add(new Equipe("Brasil", "Tite"));

        for (Equipe equipe : equipes) {
            System.out.println("Seleção: " + equipe.getNome());
            System.out.println("Técnico: " + equipe.getNome());
        }
    }
}
