import java.util.Scanner;

public class App {
    static String[] produto = new String[100];
    static int[] quantidade = new int[100];
    static char busca;
    static int indiceBusca;
    static char acao;
    static char continuarAcao;
    static int linha;
    static double rf;

    static void preencherDadosParaTeste() {
        produto[0] = "ARRUELA";
        quantidade[0] = 2000;

        produto[1] = "LUVAS";
        quantidade[1] = 400;

        produto[2] = "BOTAS";
        quantidade[2] = 250;

        produto[3] = "CAPACETES";
        quantidade[3] = 120;

        produto[4] = "PARAFUSOS";
        quantidade[4] = 4000;
    }

    static int indiceProduto(String nome) {
        int indice = -1;
        for (int linha = 0; linha < 100; linha++) {
            if (produto[linha] != null && produto[linha].contains(nome)) {
                indice = linha;
                break;
            }
        }
        return indice;
    }

    static void removerProduto(int indice) {
        for (int linha = indice + 1; linha < 100; linha++) {
            produto[linha - 1] = produto[linha];
            if (linha == 99) {
                produto[linha] = null;
            }
        }

        for (int linha = indice + 1; linha < 100; linha++) {
            quantidade[linha - 1] = quantidade[linha];
        }
    }

    static void estoque() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Ação escolhida: E - Estoque ---------");
        System.out.println("-------------------------------------");
        for (int linha = 0; linha < 100; linha++) {
            if (produto[linha] != null) {
                System.out.println(produto[linha]);
                System.out.println(quantidade[linha]);
            }
        }
        System.out.println();
    }

    static void atualizarLinha(int linha) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade: ");
        int rf = scanner.nextInt();

        produto[linha] = nome;
        quantidade[linha] = rf;
    }

    static void inserir() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Ação escolhida: I - Inserir ---------");
        System.out.println("-------------------------------------");

        for (int linha = 0; linha < 100; linha++) {
            if (produto[linha] == null) {
                System.out.println("-------------------------------");
                System.out.println("Novo índice " + linha);
                System.out.println("-------------------------------");
                atualizarLinha(linha);
                break;
            }
        }
    }

    static void atualizar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Ação escolhida: A - Atualizar -------");
        System.out.println("-------------------------------------");

        System.out.print("Informe o nome do produto a ser alterado: ");
        String busca = scanner.nextLine();
        indiceBusca = indiceProduto(busca);

        if (indiceBusca >= 0) {
            System.out.println("Encontrado no índice: " + indiceBusca);
            atualizarLinha(indiceBusca);
            System.out.println("Produto alterado com sucesso...");
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    static void deletar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Ação escolhida: D - Deletar ---------");
        System.out.println("-------------------------------------");

        System.out.print("Informe o nome do produto a deletar: ");
        String busca = scanner.nextLine();
        indiceBusca = indiceProduto(busca);

        if (indiceBusca >= 0) {
            System.out.println("Encontrado no índice: " + indiceBusca);
            removerProduto(indiceBusca);
            System.out.println("Produto removido com sucesso...");
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    static void acaoInvalida() {
        System.out.println();
        System.out.println("Opa... Ação inválida...");
        System.out.println();
    }

    static void sair() {
        continuarAcao = 'N';
        System.out.println("---------------------------------------------");
        System.out.println("--------- O sistema foi encerrado -----------");
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        preencherDadosParaTeste();
        Scanner scanner = new Scanner(System.in);

        while (continuarAcao != 'N' && continuarAcao != 'n') {
            System.out.println("-------------------------------------------------------------");
            System.out.println("---------------- Controle de Almoxarifado -------------------");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Ações Permitidas:");
            System.out.println("(e)stoque");
            System.out.println("(i)nserir");
            System.out.println("(a)tualizar");
            System.out.println("(d)eletar");
            System.out.println("(s)air");
            System.out.print("O que deseja fazer? ");
            System.out.println();

            acao = scanner.next().charAt(0);
            System.out.println();

            switch (Character.toUpperCase(acao)) {
                case 'E':
                    estoque();
                    break;
                case 'I':
                    inserir();
                    break;
                case 'A':
                    atualizar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'S':
                    sair();
                    break;
                default:
                    acaoInvalida();
            }
        }
    }
}
