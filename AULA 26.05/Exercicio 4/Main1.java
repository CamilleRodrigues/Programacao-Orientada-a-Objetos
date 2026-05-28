import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("CADASTRO DO GUERREIRO:");
        System.out.print("Nome do Guerreiro: ");
        String nomeGuerreiro = teclado.nextLine();
        int vidaGuerreiro;
        do {
            System.out.print("Vida do Guerreiro: ");
            vidaGuerreiro = teclado.nextInt();
            if (vidaGuerreiro <= 0) {
                System.out.println("A vida não pode ser negativa!");
            }
        } while (vidaGuerreiro <= 0);
        teclado.nextLine();
        Guerreiro guerreiro = new Guerreiro(nomeGuerreiro, vidaGuerreiro);

        System.out.println("\nCADASTRO DO MAGO:");
        System.out.print("Nome do Mago: ");
        String nomeMago = teclado.nextLine();
        int vidaMago;
        do {
            System.out.print("Vida do Mago: ");
            vidaMago = teclado.nextInt();
            if (vidaMago <= 0) {
                System.out.println("A vida não pode ser negativa!");
            }
        } while (vidaMago <= 0);
        teclado.nextLine();
        Mago mago = new Mago(nomeMago, vidaMago);

        System.out.println("\nCADASTRO DO PALADINO:");
        System.out.print("Nome do Paladino: ");
        String nomePaladino = teclado.nextLine();

        int vidaPaladino;
        do {
            System.out.print("Vida do Paladino: ");
            vidaPaladino = teclado.nextInt();
            if (vidaPaladino <= 0) {
                System.out.println("A vida não pode ser negativa!");
            }
        } while (vidaPaladino <= 0);
        teclado.nextLine();
        Paladino paladino = new Paladino(nomePaladino, vidaPaladino);

        try {
            int opcao = 0;

            while (opcao != 4) {
                System.out.println("\nSISTEMA RPG:");
                System.out.println("1 - Ataque do Guerreiro no Mago");
                System.out.println("2 - Feitiço do Mago no Guerreiro");
                System.out.println("3 - Cura do Paladino no Guerreiro");
                System.out.println("4 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = teclado.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o dano do Guerreiro: ");
                        int danoGuerreiro = teclado.nextInt();
                        guerreiro.atacar(mago, danoGuerreiro);
                        break;

                    case 2:
                        System.out.print("Digite o dano do Feitiço: ");
                        int danoFeitico = teclado.nextInt();
                        mago.lancarFeitico(guerreiro, danoFeitico);
                        break;

                    case 3:
                        System.out.print("Digite o valor da cura: ");
                        int cura = teclado.nextInt();
                        paladino.curarAliado(guerreiro, cura);
                        break;

                    case 4:
                        System.out.println("Encerrando sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

                System.out.println("\nSTATUS:");
                System.out.println(guerreiro.getNome() + " | Vida: " + guerreiro.getPontosVida());
                System.out.println(mago.getNome() + " | Vida: " + mago.getPontosVida());
                System.out.println(paladino.getNome() + " | Vida: " + paladino.getPontosVida());
            }

            System.out.println("\nSimulando ataques até o Mago ser derrotado...");

            while (mago.getPontosVida() > 0) {
                guerreiro.atacar(mago, 10);
            }

            System.out.println("\nTentando atacar personagem derrotado...");
            guerreiro.atacar(mago, 10);

        } catch (AlvoInvalidoException e) {
            System.out.println("\nEXCEÇÃO CAPTURADA:");
            System.out.println(e.getMessage());
        }

        teclado.close();
    }
}