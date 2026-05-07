//4. Mostre na classe principal (main) como o sistema consegue calcular corretamente os preços independentemente de ser prato ou bebida.

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pedido pedido = new Pedido();

        int opcao;

        do {

            System.out.println("\nMENU");
            System.out.println("1 - Adicionar Prato");
            System.out.println("2 - Adicionar Bebida");
            System.out.println("3 - Fechar Conta");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do prato: ");
                    String nomePrato = teclado.nextLine();

                    System.out.print("Preço base: ");
                    double precoPrato = teclado.nextDouble();

                    System.out.print("Tempo de preparo: ");
                    double tempo = teclado.nextDouble();

                    PratoPrincipal prato = new PratoPrincipal(nomePrato, precoPrato, tempo);

                    pedido.adicionarItem(prato);

                    System.out.println("Prato adicionado!");
                    break;

                case 2:
                    System.out.print("Nome da bebida: ");
                    String nomeBebida = teclado.nextLine();

                    System.out.print("Preço base: ");
                    double precoBebida = teclado.nextDouble();

                    System.out.print("É alcoólica? (true/false): ");
                    boolean alcoolica = teclado.nextBoolean();

                    Bebida bebida = new Bebida(nomeBebida, precoBebida, alcoolica);

                    pedido.adicionarItem(bebida);

                    System.out.println("Bebida adicionada!");
                    break;

                case 3:
                    double total = pedido.fecharConta();

                    System.out.println("\nTotal da conta: R$ " + total);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        teclado.close();
    }
}
