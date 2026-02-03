import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n--------------------\n   | SENTIFY | \n--------------------");
        System.out.println("\nBem vindo! \nDigite 1 para criar sua playlist");
        System.out.println("\n1 - CRIAR PLAYLIST");
        Scanner choice = new Scanner(System.in);
        int a = choice.nextInt();

        if (a == 1) {
            System.out.println("\n\n=== CRIAR PLAYLIST ===");
            System.out.println("Digite o nome da sua playlist: ");
            Scanner sa = new Scanner(System.in);
            String nomePlaylist = sa.nextLine();
            Playlist b = new Playlist(nomePlaylist);
            System.out.println("\nSua playlist foi criada com sucesso!");
            System.out.println("\nDeseja modifica-la?\nS/N");
            Scanner sb = new Scanner(System.in);
            String e = sb.nextLine();

            if (e.equalsIgnoreCase("S")) {
                System.out.println("\n\n=== MODIFICAR PLAYLIST ===");
                int escolha;
                Scanner sc = new Scanner(System.in);

                boolean continuar = true;

                while (continuar) {

                    System.out.println("\nO que deseja fazer na playlist? \n ------------------------------");
                    System.out.println("1- Adicionar música na playlist \n ------------------------------");
                    System.out.println("2- Remover musica da playlist \n ------------------------------");
                    System.out.println("3- Ver musicas recentes \n ------------------------------");
                    System.out.println("4- Listar as musicas da playlist \n ------------------------------");
                    System.out.println("0- Sair da playlist \n ------------------------------\n\n");
                    escolha = sc.nextInt();

                    switch (escolha) {
                        case 1:
                            System.out.println("ADICIONAR MÚSICA");
                            System.out.println("\n Digite qual música será adicionada: ");
                            Scanner sd = new Scanner(System.in);
                            String musica = sd.nextLine();
                            System.out.println("\n Digite o cantor da música: ");
                            Scanner se = new Scanner(System.in);
                            String cantor = se.nextLine();
                            Musica x = new Musica(musica, new Cantor(cantor));

                            b.adicionarMusica(x);
                            System.out.println("Música adicionada com sucesso!");
                            break;

                        case 2:
                            System.out.println("REMOVER MÚSICA");
                            System.out.println("Digite a música que deseja remover: ");
                            Scanner sf = new Scanner(System.in);
                            String z = sf.nextLine();

                            b.removerMusica(z);
                            break;

                        case 3:
                            System.out.println("VER MÚSICAS RECENTES");
                            b.listarRecentes();
                            break;

                        case 4:
                            System.out.println("LISTAR MÚSICAS");
                            b.listarMusica();
                            break;

                        case 0:
                            continuar = false;
                            System.out.println("SAIR");

                            break;

                        default:
                            System.out.println("Opção não encontrada! \nTente novamente.");
                            continuar = false;
                            break;
                    }
                }

            } else if (e.equalsIgnoreCase("N")) {
                System.out.println("Ok. Finalizando programa...");
            }
        } else {
            System.out.println("Número inválido. \nTente novamente.");
        }
    }
}

