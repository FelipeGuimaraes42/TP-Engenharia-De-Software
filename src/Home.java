import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Home {

    //Variáveis globais
    Scanner scanner = new Scanner(System.in);
    String opcao;

    //Cabeçalho do sistema
    public void header(){
        separarTelas();
        System.out.println("\t\t\t\t\t\t\tبطولة كأس العالم لكرة القدم 2022\n");
        System.out.println("Seja bem-vindo ao seu guia da Copa do Mundo FIFA de 2022!\n");
        System.out.println("Neste sistema você conseguirá encontrar todas as informações " +
                "relevantes sobre a Copa de 2022!");
        menuInicial();
    }

    //Menu inicial com as diversas ramificações das telas
    public void menuInicial(){
        separarTelas();
        System.out.println("MENU");
        System.out.println("Digite 1 para ver as informações gerais da copa");
        System.out.println("Digite 2 para saber mais sobre a sede");
        System.out.println("Digite 3 para ver as equipes");
        System.out.println("Digite 4 para ver os estádios");
        System.out.println("Digite esc para sair\n");
        System.out.print("Insira a opção desejada: ");

        opcao = scanner.nextLine();
        switch (opcao) {
            case "1" -> verInformacoesGeraisDaCopa();
            case "2" -> consultarSede();
            case "3" -> verEquipes();
            case "4" -> verEstadios();
            default -> terminarExecucao();
        }
    }

    //Mostra informações gerais sobre a Copa de 2022
    public void verInformacoesGeraisDaCopa() {
        separarTelas();
        System.out.println("Informações Gerais");
        System.out.println("\t◉ A Copa do Mundo de 2022 será sediada no Catar");
        System.out.println("\t◉ Será a 22a Copa do Mundo");
        System.out.println("\t◉ O campeonato será disputado entre 21 de novembro e 18 de dezembro, \n" +
                "\tprimeira vez em que é disputado no final do ano");
        System.out.println("\t◉ Será a primeira Copa do Mundo realizada no Oriente Médio");
        System.out.println("""
                \t◉ Será a última Copa do Mundo a ter o formato de 32 equipes, já que a\s
                \tcompetição terá uma mudança no formato e número de equipes na edição de 2026,\s
                \tonde será sediado no Canadá, Estados Unidos e México, passando para 48 equipes.""");

        System.out.println();
        System.out.println("Digite 1 para voltar ao menu principal");
        System.out.println("Digite 2 para saber mais sobre o Catar");
        System.out.println("Digite esc para sair\n");
        System.out.print("Insira a opção desejada: ");

        opcao = scanner.nextLine();
        switch (opcao) {
            case "1" -> menuInicial();
            case "2" -> consultarSede();
            default -> terminarExecucao();
        }
    }

    //Printa para o usuário algumas informações interessantes sobre o Catar
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

        separarTelas();
        System.out.println("Sede: " + sede.getNome());
        System.out.println("Capital: " + sede.getCapital());
        System.out.println("Continente: " + sede.getContinente());

        System.out.println("Curiosidades:");
        for(int i =0; i < sede.getCuriosidades().size(); i++){
            System.out.println("\t" + (i+1) + ". " + sede.getCuriosidades().get(i));
        }

        System.out.println();
        System.out.println("Digite 1 para ver os estádios");
        System.out.println("Digite 2 para voltar para o menu principal");
        System.out.println("Digite esc para sair\n");
        System.out.print("Insira a opção desejada: ");

        opcao = scanner.nextLine();
        switch (opcao) {
            case "1" -> verEstadios();
            case "2" -> menuInicial();
            default -> terminarExecucao();
        }
    }

    //Mostra todos os estádios
    void verEstadios(){
        List<Estadio> estadios = new ArrayList<>();
        estadios.add(new Estadio("Lusail", "Lusail",80000,
                "Em construção. Será sede da abertura e encerramento da Copa do Mundo."));
        estadios.add(new Estadio("Al Bayt", "Al Khor", 60000,
                "Construído. Em janeiro de 2020, o estádio recebeu certificados de sustentabilidade\n" +
                        "\t\t  de design verde, gestão de construção e eficiência energética"));
        estadios.add(new Estadio("Ras Abu Aboud", "Doha", 40000,
                "Em construção. Ele será construído com um design modular, usando contêineres de \n" +
                        "\t\t  transporte reciclados e deve ser desmontado após a conclusão do evento."));
        estadios.add(new Estadio("Al Thumama", "Doha", 40000,
                "Em construção. 50 mil metros quadrados de um parque público cercará o estádio.\n" +
                        "\t\t  Está localizado perto do Aeroporto Internacional de Hamad."));

        separarTelas();
        System.out.println("Estádios");
        for(Estadio estadio : estadios){
            System.out.println("Nome: " + estadio.getNome());
            System.out.println("Cidade: " + estadio.getEndereco());
            System.out.println("Capacidade: " + estadio.getCapacidade());
            System.out.println("História: " + estadio.getHistoria());
            System.out.println();
        }

        System.out.println();
        System.out.println("Digite 1 para voltar ao menu principal");
        System.out.println("Digite esc para sair\n");
        System.out.print("Insira a opção desejada: ");

        opcao = scanner.nextLine();
        if(opcao.equals("1"))
            menuInicial();
        else
            terminarExecucao();
    }

    //Mostra todas as equipes que participarão da Copa do Mundo
    public void verEquipes() {
        List<Equipe> equipes = new ArrayList<>();

        equipes.add(new Equipe("Argentina", "Lionel Scaloni"));
        equipes.add(new Equipe("Brasil", "Tite"));

        separarTelas();
        for (Equipe equipe : equipes) {
            System.out.println(equipe.getNome().toUpperCase(Locale.ROOT));
            System.out.println("\tTécnico: " + equipe.getNomeTecnico());
        }
    }

    //Mostra o chaveamento das equipes
    public void consultarTabelaDeChaveamento() {
        // Abre a classe da Tabela de Chaveamento
    }

    //Método útil que serve para separar as diversas telas do sistema
    public void separarTelas(){
        System.out.println();
        System.out.println(Cores.ANSI_BLUE + "-------------------------------------------------------------------" +
                "--------------------------" + Cores.ANSI_BLUE);
        System.out.println();
    }

    //Printa uma mensagem de despedida
    public void terminarExecucao(){
        separarTelas();
        System.out.println("Obrigado pela visita! Volte sempre!");
        separarTelas();
    }
}
